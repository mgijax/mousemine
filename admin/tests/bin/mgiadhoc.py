#!/opt/local/bin/python
#
# mgiadhoc.py
#
# Simple library for querying the MGI ad hoc database.
#
import os
import re
import sys
import types

import psycopg2
import psycopg2.extras

# Default connection parameters
HOST="adhoc.informatics.jax.org"
DATABASE="mgd"
USER="mgd_public"
PASSWORD="mgdpub"

#
def getConnectionDefaults():
    return {
    'host'     : HOST,
    'database' : DATABASE,
    'user'     : USER,
    'password' : PASSWORD 
    }

#
def setConnectionDefaults(**cparms):
    global HOST, DATABASE, USER, PASSWORD
    HOST     = cparms.get('host',HOST)
    DATABASE = cparms.get('database',DATABASE)
    USER     = cparms.get('user',USER)
    PASSWORD = cparms.get('password',PASSWORD)

#
def getConnectionParamsFromPropertiesFile(fname="~/.intermine/mousemine.properties", dname="mgiadhoc"):
    try:
        fname = os.path.abspath(os.path.expanduser(fname))
        fd = open(fname,'r')
        data = fd.read()
        fd.close()
        return {
        'host'    : re.search('^db.%s.datasource.serverName=(.*)'%dname,   data, re.M).group(1).strip(),
        'database': re.search('^db.%s.datasource.databaseName=(.*)'%dname, data, re.M).group(1).strip(),
        'user'    : re.search('^db.%s.datasource.user=(.*)'%dname,         data, re.M).group(1).strip(),
        'password': re.search('^db.%s.datasource.password=(.*)'%dname,     data, re.M).group(1).strip()
        }
    except:
        raise RuntimeError("Could not get connection data from: "+fname)

#
def setConnectionDefaultsFromPropertiesFile(fname="~/.intermine/mousemine.properties", dname="mgiadhoc"):
    cparms = getConnectionParamsFromPropertiesFile(fname,dname)
    setConnectionDefaults(**cparms)

#
def connect(host=None,database=None, user=None, password=None):
    con = psycopg2.connect( host=host or HOST, database=database or DATABASE, user=user or USER, password=password or PASSWORD )
    return con

#
def sql(queries, parsers=None, args={}, connection=None):
    single = False
    if type(queries) not in [types.ListType,types.TupleType]:
	queries = [queries]
	single=True
    if type(parsers) not in [types.ListType,types.TupleType]:
        parsers = [parsers]*len(queries)
    if type(args) not in [types.ListType,types.TupleType]:
        args = [args]*len(parsers)

    if len(queries) != len(parsers):
        raise RuntimeError("Number of queries != number of parsers.")

    closeCon = False
    if connection is None:
	connection = connect()
	closeCon = True

    results = []
    for i,q in enumerate(queries):
        cur = connection.cursor(cursor_factory=psycopg2.extras.RealDictCursor)
        cur.execute(q)
	p = parsers[i]
	a = args[i]
	if p == 'ignore':
	    results.append(None)
	elif cur.statusmessage.startswith('SELECT'):
	    if p is None:
		qr = []
		for r in cur:
		    qr.append( dict(r) )
		results.append(qr)
	    else:
	        for r in cur:
		    p( dict(r), **a )
		results.append(None)
	else:
	    results.append(None)
        cur.close()

    if closeCon:
	connection.close()

    if single:
        return results[0]
    else:
        return results

#
def __test__():
    def p(r):
        print r['symbol'], r['name']

    qlist = [ 
      'select count(*) from mrk_marker', 
      'select * from mrk_marker where _marker_key = 964'
      ]
    sql( qlist, ['ignore', p])

if __name__ == "__main__":
    __test__()
