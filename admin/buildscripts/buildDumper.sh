#!/bin/sh

export LD_LIBRARY_PATH=/usr/local/pgsql/lib
cd ~/jobs/Load_Build_Dumper/workspace/bin
sh ./refreshAll.sh
python ./setVersionProperty.py

