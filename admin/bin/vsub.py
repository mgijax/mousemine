#
# vsub.py
#
# Simple utility for doing variable substitution: given a file
# containing variable referenecs embedded in text, and a file containing
# variable definitions, output the text with the variables expanded.
#
# Typical command line:
#	% python vsub.py -v myVarDefs.txt < myTemplate.txt > result.txt
#
# For full list of options:
#	% python vsub.py -h
#
# You can specify variable definitions in files and/or on the command line.
# You can provide any number of files and command line defs. They are processed
# left-to-right. If the same variable is defined multiple times, later defs overwrite 
# earlier (i.e., the last one wins).
#

import sys
import os
import types
import re
from optparse import OptionParser

DFLT_START_RE	= '@'
DFLT_NAME_RE	= '[A-Za-z][A-Za-z0-9_.]*'
DFLT_END_RE	= '@'

class VSub(object):

    def __init__(self, s=DFLT_START_RE, n=DFLT_NAME_RE, e=DFLT_END_RE):
	#
	self.startRe = ''
	self.nameRe = ''
	self.endRe = ''
	self.setRe(s,n,e)

    #
    def getStartRe(self):
        return self.startRe
    def setStartRe(self, s):
	self.setRe(s,None,None)

    #
    def getNameRe(self):
        return self.NameRe
    def setNameRe(self, n):
	self.setRe(None,n,None)

    #
    def getEndRe(self):
        return self.endRe
    def setEndRe(self, e):
	self.setRe(None,None,e)

    #
    def setRe(self, s=None, n=None, e=None):
        if(s):
	    self.startRe = s
	if(n):
	    self.nameRe  = n
	if(e):
	    self.endRe   = e
        self.varRe = re.compile('%s(%s)%s' % (self.startRe, self.nameRe, self.endRe))

    #
    def vsub( self, text, varDict, recursive=False):
	didSub = False
	s = 0
	ss = []
	for match in self.varRe.finditer(text):
	    ms = match.start(0)
	    me = match.end(0)
	    n = match.group(1)
	    v = varDict[n]
	    ss.append(text[s:ms])
	    ss.append(v)
	    s = me
	    didSub = True
	ss.append(text[s:])
	expanded = ''.join(ss)
	if recursive and didSub:
	    expanded = self.vsub(expanded, varDict, recursive)
	return expanded
	    
class VSubDriver(object):
    def __init__(self):
	self.op = OptionParser()
	self.op.add_option(
	  "-i", "--inputfile",
	  dest="inputfile",
	  default="-",
	  metavar="FILE",
	  type="string",
	  nargs=1,
	  help="Input file name. (default=standard input)."
	  )
	self.op.add_option(
	  "-o", "--outputfile",
	  dest="outputfile",
	  default="-",
	  metavar="FILE",
	  type="string",
	  nargs=1,
	  help="Output file name. (default=standard output)."
	  )
	self.op.add_option(
	  "-v", "--varfile", 
	  metavar="FILE",
	  dest="vardefs",
	  default={},
	  nargs=1,
	  type="string",
	  action="callback",
	  callback=lambda o, n, v, p: self.parseVFile(v,p.values.vardefs),
	  help="File of variable definitions (repeatable)."
	  )
	self.op.add_option(
	  "-d", "--define", 
	  metavar="VAR=VALUE",
	  dest="vardefs",
	  default={},
	  nargs=1,
	  type="string",
	  action="callback",
	  callback=lambda o, n, v, p: self.parseVDef(v,p.values.vardefs),
	  help="Defines a variable on the command line. (repeatable)"
	  )
	self.op.add_option(
	  "-r", "--recursive", 
	  dest="recursive",
	  default=False,
	  action="store_true",
	  help="Expand substitutions recursively. (default=%default)"
	  )
	self.op.add_option(
	  "-S", "--startregex",
	  dest="startregex",
	  default=DFLT_START_RE,
	  metavar="REGEX",
	  type="string",
	  nargs=1,
	  help="Regex matching the start of variable reference (default='%default')"
	  )
	self.op.add_option(
	  "-E", "--endregex",
	  dest="endregex",
	  default=DFLT_END_RE,
	  metavar="REGEX",
	  type="string",
	  nargs=1,
	  help="Regex matching the end of variable reference (default='%default')"
	  )
	self.op.add_option(
	  "-N", "--nameregex",
	  dest="nameregex",
	  default=DFLT_NAME_RE,
	  metavar="REGEX",
	  type="string",
	  nargs=1,
	  help="Regex for a variable name (default='%default')"
	  )

    def parseVFile(self, fname, d={}):
	fd = open(fname, 'r')
	for line in fd:
	    line = line.strip()
	    if len(line) == 0 or line[0] == "#":
	        continue
	    self.parseVDef(line,d)
	fd.close()
	return d

    def parseVDef(self, vdef, d={}):
	tokens = vdef.split('=', 1)
	if len(tokens)!=2:
	    raise ValueError("Syntax error in variable definition.")
	n = tokens[0].strip()
	v = tokens[1].strip()
	d[n]=v
	return d

    def openFile(self, file, mode='r'):
	fd = None
	if type(file) is types.StringType:
	    if file == "-":
		if mode == 'r':
		    fd = sys.stdin
		else:
		    fd = sys.stdout
	    else:
		fd = open(file, mode)
	elif type(file) is type.FileType:
	    fd = file
	else:
	    raise ValueError("Argument must be an open file or a file name: " + str(file))
	return fd

    def go(self, args=sys.argv):
        self.options, self.args = self.op.parse_args(args)
	self.vsub = VSub(self.options.startregex, self.options.nameregex, self.options.endregex)
	ifd = self.openFile(self.options.inputfile)
	ofd = self.openFile(self.options.outputfile, 'w')
	for line in ifd:
	    if not(len(line.strip()) == 0 or line[0] == "#"):
		line = self.vsub.vsub(line, self.options.vardefs, self.options.recursive)
	    ofd.write(line)
	ifd.close()
	ofd.close()

if __name__ == "__main__":
    VSubDriver().go(sys.argv)
