# !/bin/sh


current=$(grep 'project.releaseVersion' /var/lib/jenkins/intermine/mousemine/webapp/build/main/intermine.properties)

dumper=$(grep 'project.releaseVersion' /var/lib/jenkins/.intermine/mousemine.properties)

echo $dumper
echo $current

if [ "$dumper" = "$current" ]
 then
	echo "Dumped data is same as deployed. Don't build."
	exit 99
 else
	echo "Dumped data is new. Need to build."
	exit 0
fi	

