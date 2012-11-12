#!/bin/sh
if [ "${WORKSPACE}" != "" ]
 then
	if [ ! -d "dumps" ]
	then
		ln -s /usr/local/pgsql/dumps dumps
	fi

	source ~/buildscripts/doExports.sh		

	dropdb mousemine
        createdb mousemine

	cd ~/intermine/mousemine
	../bio/scripts/project_build -b -v localhost ${WORKSPACE}/dumps/mm-dump

	cd ~/intermine/mousemine/webapp
	ant precompute-templates

else
	echo "script requires jenkins param WORKSPACE to be set."
	exit 99
fi
