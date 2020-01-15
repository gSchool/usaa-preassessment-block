#!/bin/bash

cp submission.txt src/main/java/Challenge.java
./gradlew clean test 2>&1

# For more detail, run "./gradlew test --info"
