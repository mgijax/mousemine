#!/bin/sh

if [ "$1" != "" ]
then
    cd $1
    LATEST_TAG=`git describe --abbrev=0`
    echo "Latest tag is $LATEST_TAG"
    git checkout $LATEST_TAG
else
    echo "Script requires build directory path as an argument."
    exit 99
fi

