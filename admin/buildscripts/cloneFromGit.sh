#!/bin/sh

CHECKOUT_LATEST_TAG=FALSE
BRANCH="master"
while getopts ":tr:o:b:" flag
do
    case $flag in
	t) CHECKOUT_LATEST_TAG=TRUE;;
	r) GIT_REPO=$OPTARG;;
	o) CLONE_PATH=$OPTARG;;
	b) BRANCH=$OPTARG;;
    esac
done

if [[ $GIT_REPO = "" || $CLONE_PATH = "" ]]
then
    echo "Script requires parameters for repository and clone path"
    exit 99
fi

if [ $CLONE_PATH = `pwd` ]
then
    cd ..
fi

rm -fR $CLONE_PATH
git clone git://github.com/mgijax/$GIT_REPO $CLONE_PATH

if [ "$CHECKOUT_LATEST_TAG" = "TRUE" ]
then
    . ~jenkins/buildscripts/checkoutLatestTag.sh $CLONE_PATH
fi

cd $CLONE_PATH
git checkout $BRANCH
