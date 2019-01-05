#!/bin/sh

DIR=`dirname $0`
EXPORT=
IMPORT=
DARG=
WARG=

# 
usage=0
while getopts ":w:X" flag
do
	#echo $OPTARG $OPTIND
        case $flag in
                X) DARG="-X";;
		w) WARG=$OPTARG
		   if [[ $WARG != "tags" && $WARG != "templates" ]]
		   then
		       echo "Unknown type."
		       usage=1
		   fi
		   ;;
                ?) usage=1;;
        esac
done    

shift $(($OPTIND-1))
if [[ $# < 2 ]] 
then
    echo "Must specify a source and at least one destination."
    usage=1
fi

if [[ $usage == 1 ]]
then
    echo "Usage: "
    echo "$0 [options] SRC DEST [DEST ...]"
    echo "SRC and DEST are server config files for the export/import scripts"
    echo " -w What to copy, either 'tags' or 'templates'"
    echo " -t template name to export a specific template "
    echo "     (query syntax is 'like %TEMPLATE_NAME%' ) "
    echo " -X delete existing tags/templates before importing into DEST"
    exit 1
fi

if [[ $WARG == "tags" ]]
then
    EXPORT="$DIR/exportTags.sh"
    IMPORT="$DIR/importTags.sh"
else
    EXPORT="$DIR/exportTemplates.sh"
    IMPORT="$DIR/importTemplates.sh"
fi

FROM=$1
shift
echo $EXPORT -c $FROM
sh $EXPORT -c $FROM

while [[ $# > 0 ]]
do
	TO=$1
	echo $IMPORT -c $TO $DARG
	sh $IMPORT -c $TO $DARG
	shift
done


