#!/bin/sh

source ~/buildscripts/doExports.sh

cd ~/intermine/mousemine/webapp

if [ "$1" != "" ]
then
	ant stop-webapp -Drelease=$1
else
	ant stop-webapp
fi
