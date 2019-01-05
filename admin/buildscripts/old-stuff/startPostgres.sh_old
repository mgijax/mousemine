#!/bin/sh                                                                                                                                        
IS_RUNNING=`/usr/local/pgsql/bin/pg_ctl status -D /usr/local/pgsql/data | grep PID | wc -l`
if [ "$IS_RUNNING" = 0 ]
then
    /usr/local/pgsql/bin/pg_ctl start -w -D /usr/local/pgsql/data -l /var/lib/pgsql/postgres.log
elif [ "$IS_RUNNING" != 0 ]
then
    echo "POSTGRES is already running."
    exit 99
fi
