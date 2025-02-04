#!/opt/local/bin/python
#
# mgiadhoc.py
#
# Simple library for querying MGI databases.
#
import os
import re
import sys
import types

import psycopg2
import psycopg2.extras

# Connection parameters
HOST = None
DATABASE = None
USER = None
PASSWORD = None

#
def getConnection():
    return {
    'host'     : HOST,
    'database' : DATABASE,
    'user'     : USER,
    'password' : PASSWORD
    }

#
def setConnection(**cparms):
    global HOST, DATABASE, USER, PASSWORD
    HOST     = cparms.get('host',HOST)
    DATABASE = cparms.get('database',DATABASE)
    USER     = cparms.get('user',USER)
    PASSWORD = cparms.get('password',PASSWORD)

#
def getConnectionParamsFromPropertiesFile(dname=None, fname="~/.intermine/mousemine.properties"):
    try:
        fname = os.path.abspath(os.path.expanduser(fname))
        fd = open(fname,'r')
        data = fd.read()
        fd.close()
        if dname is None:
            dname = re.search('^db.mgi-source.datasource.sourceName=(.*)', data, re.M).group(1).strip()
        
        return {
        'host'    : re.search('^db.%s.datasource.serverName=(.*)'%dname,   data, re.M).group(1).strip(),
        'database': re.search('^db.%s.datasource.databaseName=(.*)'%dname, data, re.M).group(1).strip(),
        'user'    : re.search('^db.%s.datasource.user=(.*)'%dname,         data, re.M).group(1).strip(),
        'password': re.search('^db.%s.datasource.password=(.*)'%dname,     data, re.M).group(1).strip()
        }
    except:
        raise RuntimeError("Could not get connection data from: "+fname)

#
def setConnectionFromPropertiesFile(dname=None, fname="~/.intermine/mousemine.properties"):
    cparms = getConnectionParamsFromPropertiesFile(dname, fname)
    setConnection(**cparms)

#
def connect(host=None,database=None, user=None, password=None):
    con = psycopg2.connect( host=host or HOST, database=database or DATABASE, user=user or USER, password=password or PASSWORD )
    return con

# Cursor name parameters
NAMELEN = 10
ITERSIZE = 1000000
import random
import string

#
def sqliter(query, connection=None):
    closeCon = False
    if connection is None:
        connection = connect()
        closeCon = True

    # generate a server-side (named) cursor
    cn = 'C_' + ''.join(random.SystemRandom().choice(string.ascii_uppercase + string.digits) for _ in range(NAMELEN))
    cur = connection.cursor(name=cn, cursor_factory=psycopg2.extras.RealDictCursor)
    cur.itersize = ITERSIZE
    cur.execute(query)
    for r in cur:
        yield r
    cur.close()

    if closeCon:
        connection.close()

#
def sql(queries, parsers=None, args={}, connection=None):
    single = False
    if type(queries) not in [list,tuple]:
        queries = [queries]
        single=True
    if type(parsers) not in [list,tuple]:
        parsers = [parsers]*len(queries)
    if type(args) not in [list,tuple]:
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
                    #qr.append( dict(r) )
                    qr.append( r )
                results.append(qr)
            else:
                for r in cur:
                    #p( dict(r), **a )
                    p( r, **a )
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
        print(r['symbol'], r['name'])

    qlist = [ 
      'select count(*) from mrk_marker', 
      'select * from mrk_marker where _marker_key = 964'
      ]
    sql( qlist, ['ignore', p])

    global res
    res = []
    for r in sqliter("select * from acc_mgitype"):
      print(r)
      res.append(r)

if __name__ == "__main__":
    HOST="bhmgidb07lp.jax.org"
    DATABASE="pub"
    USER="mgd_public"
    PASSWORD="mgdpub"
    __test__()
