#!/bin/sh

cd ~/etl_build/etl/bin
git pull
e=$?; if [ $e -ne 0 ]; then exit $e; fi
python ./refresh.py
e=$?; if [ $e -ne 0 ]; then exit $e; fi
python ./setVersionProperty.py
e=$?; if [ $e -ne 0 ]; then exit $e; fi

