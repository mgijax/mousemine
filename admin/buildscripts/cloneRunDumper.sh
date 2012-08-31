#!/bin/sh

if ["${WORKSPACE}" != '']
then
	rm -fR ${WORKSPACE}
	git clone git://github.com/mgijax/mousemine_dumper.git ${WORKSPACE} 
	export LD_LIBRARY_PATH=/usr/local/pgsql/lib
	cd ${WORKSPACE}/bin
	sh ./refreshAll.sh
	sh ./refreshItemsSample.sh
	python ./setVersionProperty.py
else
	echo "Jenkins parameter WORKSPACE must be set."
fi
