#!/bin/sh

export LD_LIBRARY_PATH=/usr/local/pgsql/lib
cd ~/etl_build/etl/bin
sh ./refreshAll.sh
python ./setVersionProperty.py

