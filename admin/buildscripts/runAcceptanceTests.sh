#!/bin/sh
ALL_TESTS_PASSED=true

source ~/buildscripts/doExports.sh

cd ~/intermine/mousemine/admin/tests/bin
python compareMmToMgi.py ../resources >../output/comparative_test.txt
RESULT=`grep FAILED ../output/comparative_test.txt | wc -l`
if [ "$RESULT" = 0 ]
then
        echo "Comparative DB testing passed."
elif [ "$RESULT" != 0 ]
then
        echo "Comparative DB testing failed."
	cp ../output/comparative_test.txt ${WORKSPACE}
	cat ../output/comparative_test.txt
        ALL_TESTS_PASSED=false
fi

if [ "$ALL_TESTS_PASSED" = "true" ]
then
    exit 0
else
    exit 99
fi
