#!/bin/sh
ALL_TESTS_PASSED=TRUE

source ~/buildscripts/doExports.sh

cd ~/intermine/mousemine/integrate
ant acceptance-tests
RESULT=`grep FAILED build/acceptance_test.html | wc -l`
if [ "$RESULT" = 0 ]
then
	echo "Integrate acceptance testing passed."
elif [ "$RESULT" != 0 ]
then
	echo "Integrate acceptance testing failed."
	cp build/acceptance_test.html ${WORKSPACE}
	echo "${JENKINS_URL}job/${JOB_NAME}/ws/acceptance_test.html"
	ALL_TESTS_PASSED=false
fi

cd ~/intermine/mousemine/admin/tests/bin
python compareMmToMgi.py ../resources/tests.cfg >../output/comparative_test.txt
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

if [ $ALL_TESTS_PASSED ]
then
    exit 0
else
    exit 99
fi
