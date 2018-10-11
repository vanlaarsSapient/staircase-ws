#!/usr/bin/env bash

mvn clean verify
mvn org.pitest:pitest-maven:mutationCoverage -DtimestampedReports=false
mvn sonar:sonar -Dsonar.host.url=http://localhost:9000


# open reports

cd target/pit-reports
open index.html
cd ..
cd site/jacoco
open index.html