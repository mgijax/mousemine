#!/bin/sh

export LD_LIBRARY_PATH=/usr/local/pgsql/lib
cd ~/jobs/Load_Build_Dumper/workspace/bin
sh ./refreshAll.sh
sh ./refreshItemsSample.sh
python ./setVersionProperty.py

