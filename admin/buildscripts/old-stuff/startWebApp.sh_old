#!/bin/sh

source ~/buildscripts/doExports.sh

cd ~/intermine/mousemine/webapp

if [ "$1" != "" ]
then
	ant start-webapp -Drelease=$1
else
	ant start-webapp
fi
