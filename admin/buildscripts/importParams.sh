#!/bin/sh

WEBAPP_URL=0
USER_NAME=superuser
PASSWORD=superuser
INPUT_FILE=0
DELETE=
while getopts ":u:p:n:c:f:X" flag
do
	case $flag in
		c) echo "using config from "$OPTARG
		   source $OPTARG;;
		u) WEBAPP_URL=$OPTARG;;
		p) PASSWORD=$OPTARG;;	
		n) USER_NAME =$OPTARG;;
		f) INPUT_FILE=$OPTARG;;
		X) DELETE=" -d overwriting=true";;
		?) echo "Usage:"
		   echo " -u URL of the webapp Required"
		   echo " -n username, default $USER_NAME"
                   echo " -p password, default $PASSWORD" 
		   echo " -f file with tag or template data, default tags.xml or templateQueries.xml "
		   echo " -X to delete existing tags/templates (same thing as using checkbox on webapp) "
		   echo " -c config a config file that defines any of the following "
		   echo "    WEBAPP_URL, USER_NAME, PASSWORD, INPUT_FILE"
		   break ;;

	esac

done	

if [ "$WEBAPP_URL" = 0 ]
then
	echo "-u must be the URL of the destination webapp." 
fi

 OPTIND=0
