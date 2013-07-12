#
# compareMmAndMgi.py
#
# Script to run pairs of queries, one against MouseMine and one against MGI, 
# and compare the results. 
# 
# Usage:
#    % python compareQueries.py CONFIGFILE.cfg
#
# CONFIGFILE.cfg is a configuration file is standard cfg format (see standard Python
# library, ConfigParser). It contains settings defining the database connections 
# and the tests
#
#

import sys
from ConfigParser import ConfigParser
import mgiadhoc

compFcns = {
    'eq' : lambda x,y : x==y,
    'ne' : lambda x,y : x!=y,
    'lt' : lambda x,y : x<y,
    'le' : lambda x,y : x<=y,
    'gt' : lambda x,y : x>y,
    'ge' : lambda x,y : x>=y,
    }

def readTests(cfname):
    cp = ConfigParser()
    cp.read(cfname)
    # need to be able to get the tests (sections) in order
    cp.tests = []
    for line in open(cfname,'r'):
        if line.startswith("[TEST:"):
	    cp.tests.append(line[1:-2])
    return cp

def getConnection(cp, name):
    secName = "CONNECTION:"+name
    host = cp.get(secName, "host")
    database = cp.get(secName, "database")
    user = cp.get(secName, "user")
    password = cp.get(secName, "password")
    con = mgiadhoc.connect(host=host, database=database, user=user, password=password)
    return con

def doQ(con, q):
    return mgiadhoc.sql( q, connection=con )

def doTest(name, mgiquery, mmquery, filter, op):
    try:
	print 
	print "-"*60
	print "TEST:", name
	filt = eval("lambda x : " + filter)
        func = compFcns.get(op, None)
        if func is None:
            func = eval( "lambda x,y : " + op )
        vmgi = filt(doQ( mgicon, mgiquery ))
        print "MGI:", vmgi
        vmm  = filt(doQ( mmcon,  mmquery  ))
	print "MM: ", vmm
        res  = func(vmgi, vmm)
	print res
	return res
    except:
        print "Test caught an exception."
	print name
	ex =  sys.exc_info()
	print ex[0], ex[1], ex[2]
	mgicon.reset()
	mmcon.reset()
	return False
    

def main():
    global mgicon
    global mmcon
    cp = readTests( sys.argv[1] )
    mgicon = getConnection(cp, "mgi")
    mmcon  = getConnection(cp, "mousemine")
    res = True
    for s in cp.tests:
        res2 = doTest(s[5:], cp.get(s,"mgi"), cp.get(s, "mousemine"), cp.get(s, "filter"), cp.get(s, "compare"))
	res = res and res2
    if res:
	print "PASSED."
#        sys.exit(0)
    else:
	print "FAILED."
#        sys.exit(-1)

main()
