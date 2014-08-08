#!/bin/sh
if [ "${WORKSPACE}" != "" ]
 then

	if [ ! -d "dumps" ]
	 then
    		ln -s /usr/local/pgsql/dumps dumps
	fi	

	export PATH=/usr/local/pgsql/bin:$PATH
	export PGUSER=postgres
	export PGDATA=/usr/local/pgsql/data

	RESULT=`psql --list | grep ^.mousemine[' '] | wc -l`
	if [ "$RESULT" != 0 ]
	 then
		dropdb mousemine
	elif [ "$RESULT" = 0 ]
	 then
		echo "No mousemine db to drop."
	fi

	createdb -T template0 mousemine
	pg_restore -d mousemine -U postgres ${WORKSPACE}/dumps/mm-dump.final

	cd ~/intermine/mousemine/webapp
	ant precompute-templates

else
	echo "script requires jenkins param WORKSPACE to be set."
	exit 99
fi
