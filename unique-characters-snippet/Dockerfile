# Install latest release of Java version 9
FROM openjdk:8-jdk-slim

# Create directory for app
RUN mkdir /app

# Set as current directory for RUN, ADD, COPY commands
WORKDIR /app

# Add Gradle from upstream
COPY gradle ./gradle
COPY gradlew ./
COPY gradlew.bat ./
COPY build.gradle ./

# Install dependencies
RUN { \
    echo 'task fetchDependencies { description "Pre-downloads *most* dependencies"'; \
    echo 'doLast { configurations.getAsMap().each { name, config ->'; \
    echo 'print "Fetching dependencies for $name..."'; \
    echo 'try { config.files; println "done" }'; \
    echo 'catch (e) { println ""; project.logger.info e.message; }'; \
    echo '} } }'; \
} >>./build.gradle \
    && ./gradlew --no-daemon clean fetchDependencies

# Add entire student fork (overwrites previously added files)
ARG SUBMISSION_SUBFOLDER
COPY $SUBMISSION_SUBFOLDER ./

# Overwrite files in student fork with upstream files
COPY test.sh ./
COPY build.gradle ./

CMD ["tail", "-f", "/dev/null"]
