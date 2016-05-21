#!/bin/sh
PLATFORM=platform-a
java -Djava.ext.dirs=./$PLATFORM/target:./service-api/target -cp ./app1/target/app1-1.0-SNAPSHOT.jar np.com.axhixh.app1.App

