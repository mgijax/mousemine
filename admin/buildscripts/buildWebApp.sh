#!/bin/sh

source ~/buildscripts/doExports.sh

cd ~/intermine/mousemine/webapp
ant clean-all
find . -exec touch {} \;

if [ "$1" != "" ]
then
	ant default -Drelease=$1
else
	ant default
fi
