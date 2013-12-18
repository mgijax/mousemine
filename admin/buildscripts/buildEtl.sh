#!/bin/sh

export LD_LIBRARY_PATH=/usr/local/pgsql/lib
cd ~/etl_build/etl/bin
sh ./refreshAll.sh
e=$?; if [ $e -ne 0 ]; then exit $e; fi
python ./setVersionProperty.py

