#!/bin/sh

. `dirname $0`/exportParams.sh

if [ "$quit" = 0 ]
then

if [ "$OUTPUT_FILE" = 0 ]
then
 OUTPUT_FILE=templateQueries.xml
fi

export PGPASSWORD=$DB_PASSWORD

psql -h $DB_HOST -d $DB_NAME -U $DB_USER_NAME << EOF

\t
\o $OUTPUT_FILE
\qecho '<template-queries>'
select stq.templatequery from savedtemplatequery stq, userprofile up
where up.username ='superuser' and stq.userprofileid = up.id and stq.templatequery like '%$TEMPLATE_NAME%' ;
\qecho '</template-queries>'
EOF


unset PGPASSWORD

fi
