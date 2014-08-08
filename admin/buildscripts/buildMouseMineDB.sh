#!/bin/sh
if [ "${WORKSPACE}" != "" ]
 then
	if [ ! -d "dumps" ]
	then
		ln -s /usr/local/pgsql/dumps dumps
	fi

	source ~/buildscripts/doExports.sh		

	psql -c "select pg_terminate_backend(procpid) from pg_stat_activity where datname='mousemine'";

	dropdb mousemine
        createdb mousemine

	. ~/buildscripts/startTomcat.sh

	cd ~/intermine/mousemine
	../bio/scripts/project_build -b -v localhost ${WORKSPACE}/dumps/mm-dump

	cd ~/intermine/mousemine/webapp
	ant precompute-templates

else
	echo "script requires jenkins param WORKSPACE to be set."
	exit 99
fi
