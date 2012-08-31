#!/bin/sh
if [ "${WORKSPACE}" != "" ]
 then
	if [ ! -d "dumps" ]
	then
		ln -s /usr/local/pgsql/dumps dumps
	fi

	source ~/scripts/doExports.sh		

	dropdb mousemine
        createdb mousemine

	python ~/intermine/mousemine/admin/bin/vsub.py -i ~/intermine/mousemine/admin/resources/project.xml.template -v ~/.intermine/vsub.properties -o ~/intermine/mousemine/project.xml  --define=mgi.build.type=mgi-base

	cd ~jenkins/intermine/mousemine
	../bio/scripts/project_build -b -v localhost ${WORKSPACE}/dumps/mm-dump
else
	echo "script requires jenkins param WORKSPACE to be set."
	exit 99
fi
