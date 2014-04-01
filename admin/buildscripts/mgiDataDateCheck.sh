#!/bin/sh

export LD_LIBRARY_PATH=/usr/local/pgsql/lib
cd ~/etl_build/etl/bin
python ./checkForMgiUpdate.py
e=$?; if [ $e -ne 0 ]; then exit $e; fi

