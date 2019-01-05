#!/bin/sh

cd ~/intermine/mousemine/webapp

ant clean
find . -exec touch {} \;

if [ "$1" != "" ]
then
	ant default -Drelease=$1
else
	ant default
fi
