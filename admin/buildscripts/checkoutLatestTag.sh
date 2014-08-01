#!/bin/sh

if [ "$1" != "" ]
then
    cd $1
    LATEST_TAG=`git for-each-ref --sort='*authordate' --format='%(refname:short)' refs/tags | grep mousemine | tail -1`

    echo "Latest tag is $LATEST_TAG"
    git checkout $LATEST_TAG
else
    echo "Script requires build directory path as an argument."
    exit 99
fi

