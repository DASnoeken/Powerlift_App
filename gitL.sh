#!/bin/bash
if [ $# -ne 1 ] 
then
	echo "Voer je naam in als input argument"
	exit 1
fi

git checkout master
git pull
fbranch="feature"$1
echo "Nu op featurebranch: "$fbranch
git checkout $fbranch
git merge master