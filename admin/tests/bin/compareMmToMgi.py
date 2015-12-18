#
# compareMmAndMgi.py
#
# Script to run pairs of queries, one against MouseMine and one against MGI, 
# and compare the results. Produces (on stdout) a diagnostic report of all tests run
# and which (if any) failed.
# 
# Usage:
#    % python compareQueries.py CONFIGFILE.cfg [MINE.properties]
#
# CONFIGFILE.cfg is a configuration file is standard cfg format (see standard Python
# library, ConfigParser). It contains the tests to run. CONFIGFILE,is required.
# 
# The optional second argument specifies the MINE.properties file, which contains connection
# parameters for both MouseMine and for the MGI adhoc database. 
# (Defaults to ~/.intermine/mousemine.properties)
#
#

import sys
from ConfigParser import ConfigParser
import re
import os
import mgiadhoc as db

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

def doQ(con, q):
    r = db.sql( q, connection=con )
    r.sort()
    return r

def doTest(file, name, mgiquery, value, mmquery, filter, op):
    try:
	print 
	print "-"*60
        print "Test File:", file
	print "TEST:", name
	filt = eval("lambda x : " + filter)
        func = compFcns.get(op, None)
        if func is None:
            func = eval( "lambda x,y : " + op )
        vmm = filt(doQ( mmcon,  mmquery  ))
        if len(mgiquery) == 0:
            vmgi = long(value)
            vmm = vmm[0].values()[0]
        else:
           vmgi = filt(doQ( mgicon, mgiquery ))
        res  = func(vmgi, vmm)
	print res
	if not res:
	    print "MGI:", vmgi
	    print "MM: ", vmm
	return res
    except:
        print "Test caught an exception."
        print mgiquery
	print name
	ex =  sys.exc_info()
	print ex[0], ex[1], ex[2]
	mgicon.reset()
	mmcon.reset()
	return False
    

def usage():
    print "usage: %s TESTS_DIR [MINE.properties] > RESULTS" % sys.argv[0]
    sys.exit(0)

def main():
    global mgicon
    global mmcon
    if len(sys.argv) == 1 or len(sys.argv) > 3:
        usage()
    mpFile = "~/.intermine/mousemine.properties"
    if len(sys.argv) == 3:
        mpFile = sys.argv[2]
    mgiparams = db.getConnectionParamsFromPropertiesFile(dname="mgiadhoc",fname=mpFile)
    mgicon = db.connect(**mgiparams)
    mmparams = db.getConnectionParamsFromPropertiesFile(dname="production",fname=mpFile)
    mmcon =  db.connect(**mmparams)
    print "-"*60
    print "MGI/MouseMine Comparative Acceptance Tests"
    print "MGI connection:", mgiparams['host'], mgiparams['database']
    print "MouseMine connection:", mmparams['host'], mmparams['database']
    res = True
    failedTests = []
    skippedFiles = []
    for cfname in os.listdir(sys.argv[1]):
        cffullname = os.path.abspath(os.path.join(sys.argv[1],cfname))
        if cffullname.endswith(".cfg"):        
            cp = readTests(cffullname)
            for s in cp.tests:
	        tname = s[5:]
	        # check if enabled
	        eflag = cp.get(s,"enabled",{"enabled":"true"}).lower().strip()
	        if eflag == "false":
	            continue

                mgi = ""
                value = ""
                if cp.has_option(s,"mgi"):
                    mgi = cp.get(s,"mgi")
                if cp.has_option(s,"value"):
                    value = cp.get(s,"value");
                res2 = doTest(
                    cfname,
	            tname, 
	            mgi,
                    value,
	            cp.get(s,"mousemine"), 
	            cp.get(s,"filter"), 
	            cp.get(s,"compare"))
	    if not res2:
	        failedTests.append(tname)
            res = res and res2
        else:
            skippedFiles.append(cfname)
    print
    print "-"*60
    if res:
	print "PASSED all tests."
#        sys.exit(0)
    else:
	print "FAILED these tests:"
	for t in failedTests:
	    print "    " + t
#        sys.exit(-1)
    for f in skippedFiles:
        print "Skipped non .cfg file "+f

main()
