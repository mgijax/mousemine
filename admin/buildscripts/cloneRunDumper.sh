#!/bin/sh

	rm -fR ~/jobs/Load_Build_Dumper/workspace
	git clone git://github.com/mgijax/mousemine_dumper.git ~/jobs/Load_Build_Dumper/workspace
	export LD_LIBRARY_PATH=/usr/local/pgsql/lib
	cd ~/jobs/Load_Build_Dumper/workspace/bin
	sh ./refreshAll.sh
	sh ./refreshItemsSample.sh
	python ./setVersionProperty.py
