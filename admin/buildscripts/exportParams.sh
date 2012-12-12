#!/bin/sh

DB_HOST=localhost
DB_USER_NAME=postgres
DB_PASSWORD=postgres
DB_NAME=userprofile-mousemine
TEMPLATE_NAME=
OUTPUT_FILE=0

quit=0
while getopts ":h:p:n:c:f:t:d:" flag
do
	case $flag in
		c) echo "using config from "$OPTARG
		   source $OPTARG;;
		h) DB_HOST=$OPTARG;;
		p) DB_PASSWORD=$OPTARG;;	
		n) DB_USER_NAME =$OPTARG;;
		f) OUTPUT_FILE=$OPTARG;;
		t) TEMPLATE_NAME=$OPTARG;;
		d) DB_NAME=$OPTARG;;
		?) echo "Usage: "
		   echo " -h database host, default $DB_HOST"
		   echo " -n database username, default $DB_USER_NAME"
                   echo " -p database password, default $DB_PASSWORD" 
                   echo " -d database name, default $DB_NAME" 
		   echo " -f ouput file, default tags.xml or templateQueries.xml "
		   echo " -t template name to export a specific template "
		   echo "     (query syntax is 'like %TEMPLATE_NAME%' ) "
		   echo " -c config file that defines any of the following "
		   echo "    DB_HOST, DB_USER_NAME, DB_PASSWORD, DB_NAME, TEMPLATE_NAME, OUTPUT_FILE "
		   quit=1
		   break ;;

	esac

done	

 OPTIND=0
