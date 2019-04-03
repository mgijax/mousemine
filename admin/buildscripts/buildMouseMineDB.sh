#!/bin/sh

RESTART=false

while getopts r opt
do case "$opt" in
	r) RESTART=true;;
   esac
done


if [ ! -d "dumps" ]
then
    ln -s /var/lib/pgsql/jenkins_data/dumps dumps
fi

export PGUSER=intermine
cd ~/intermine/mousemine

if [[ $RESTART = true ]]
then
    # restart build from last completed checkpoint
    #   no loading dumped data - assumes previous data is in database
    ../bio/scripts/project_build -l -v localhost ${WORKSPACE}/dumps/mm-dump
else
    # good old-fashioned normal build
    psql -c "select pg_terminate_backend(pid) from pg_stat_activity where datname='mousemine'";

    dropdb mousemine
    createdb mousemine

    ../bio/scripts/project_build -b -v localhost ${WORKSPACE}/dumps/mm-dump
fi
