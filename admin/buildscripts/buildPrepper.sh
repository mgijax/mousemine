#!/bin/sh

export LD_LIBRARY_PATH=/usr/local/pgsql/lib
cd ~/prepper/bin
sh ./refreshAll.sh
python ./setVersionProperty.py

