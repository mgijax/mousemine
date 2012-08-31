#!/bin/sh

source ~/buildscripts/doExports.sh

cd ~/intermine/mousemine/integrate
ant acceptance-tests
RESULT=`grep FAILED build/acceptance_test.html | wc -l`
if [ "$RESULT" = 0 ]
then
	echo "Acceptance testing passed."
elif [ "$RESULT" != 0 ]
then
	echo "Acceptance testing failed."
	exit 99
fi
