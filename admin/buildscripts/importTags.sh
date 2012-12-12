#!/bin/bash

. importParams.sh


CookieFileName=cookies.txt

if [ $INPUT_FILE = 0 ]
then
 INPUT_FILE=tags.xml
fi

if [ $WEBAPP_URL != 0 ]
then
curl --cookie  $CookieFileName --cookie-jar \
$CookieFileName --user-agent Mozilla/4.0 \
--data "username=$USER_NAME&password=$PASSWORD" \
$WEBAPP_URL/loginAction.do? > /dev/null \


curl --cookie cookies.txt --user-agent Mozilla/4.0 \
 --data-urlencode xml@$INPUT_FILE $DELETE \
$WEBAPP_URL/importTags.do > /dev/null \

fi
