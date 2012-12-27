#!/bin/sh

. `dirname $0`/exportParams.sh

if [ "$quit" = 0 ]
then

if [ "$OUTPUT_FILE" = 0 ]
then
 OUTPUT_FILE=tags.xml
fi

export PGPASSWORD=$DB_PASSWORD

psql -h $DB_HOST -d $DB_NAME -U $DB_USER_NAME << EOF

\t
\o $OUTPUT_FILE
\qecho '<tags>'
select '<tag name="' || t.tagname || '" objectIdentifier="' || t.objectidentifier || '" type="' || t.type || '"></tag>' from tag t, userprofile up where t.userprofileid = up.id and up.username ='superuser' and t.objectidentifier like '%$TEMPLATE_NAME%';
\qecho '</tags>'
EOF

unset PGPASSWORD

fi
