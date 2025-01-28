#!/bin/sh

# retrive date for last adhoc update
export PGPASSWORD="mgdpub"
ADHOC_UPDATE=`psql -h bhmgidb07lp.jax.org -U mgd_public -d pub -c "SELECT lastdump_date from mgi_dbinfo" | sed -n '3p'`

if [ "$1" != "" ]
then
    PREFIX=$1
else
    PREFIX=www
fi

# retrive date for last MouseMine database update
#
# The xml query for the url below:
# <query name="" model="genomic" view="DataSource.description" longDescription="">
#  <constraint path="DataSource.name" op="=" value="MGI"/>
# </query>
#
wget -O ~/tmp/mmdb_date.txt http://${PREFIX}.mousemine.org/mousemine/service/query/results?query=%3Cquery+name%3D%22%22+model%3D%22genomic%22+view%3D%22DataSource.description%22+longDescription%3D%22%22%3E%3Cconstraint+path%3D%22DataSource.name%22+op%3D%22%3D%22+value%3D%22MGI%22%2F%3E%3C%2Fquery%3E
MMDB_UPDATE=`grep "....-..-.." -o ~/tmp/mmdb_date.txt`


#convert to string to date object
ADHOC_LAST_UPDATED=`date -d "$ADHOC_UPDATE" +"%Y%m%d"`
MMDB_LAST_UPDATED=`date -d "$MMDB_UPDATE" +"%Y%m%d"`

echo "adhoc = $ADHOC_LAST_UPDATED"
echo "mmdb = $MMDB_LAST_UPDATED"

if [ $ADHOC_LAST_UPDATED -gt $MMDB_LAST_UPDATED ];
then
    echo "RUN_MMDB_UPDATE=Update-MMDB"
else
    echo "MouseMine database is up to date."
fi
