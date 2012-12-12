#!/bin/sh
RESULT=`netstat -na | grep 8080 | grep LISTEN | wc -l`
if [ "$RESULT" = 0 ] 
then
# Start tomcat in logs directory (to ensure intermine.log saved in the logs directory)
	cd /usr/local/tomcat/logs
	export CATALINA_OPTS="-Xms2048m -Xmx2048m"
	export JAVA_OPTS="-Djava.awt.headless=true" 
	sudo /usr/local/tomcat/bin/startup.sh
elif [ "$RESULT" != 0 ] 
then
	echo "TOMCAT is running."
fi
