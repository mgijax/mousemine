#!/bin/sh
IS_RUNNING=`netstat -na | grep 8080 | grep LISTEN | wc -l`
if [ "$IS_RUNNING" = 0 ] 
then
# Start tomcat in logs directory (to ensure intermine.log saved in the logs directory)
	cd /usr/local/tomcat/logs
	export CATALINA_OPTS="-Xms4m -Xmx6m"
	export JAVA_OPTS="-Djava.awt.headless=true" 
	sudo /usr/local/tomcat/bin/startup.sh
elif [ "$IS_RUNNING" != 0 ] 
then
	echo "TOMCAT is ready running."
	exit 99
fi
