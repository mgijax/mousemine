#!/bin/sh

source ~/scripts/doExports.sh

cd ~/intermine/mousemine/webapp
ant clean-all
find . -exec touch {} \;

if [ "$1" != "" ]
then
	ant default remove-webapp release-webapp -Drelease=$1
else
	ant default remove-webapp release-webapp
fi
