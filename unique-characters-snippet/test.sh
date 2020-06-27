#!/bin/bash
submission_file=${1:-submission.txt}

cp $submission_file src/main/java/Challenge.java
./gradlew clean test 2>&1

# For more detail, run "./gradlew test --info"
