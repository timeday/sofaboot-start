# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="kingpzd@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080
# sofa service rest api port
EXPOSE 8341
# sofa service rpc direct port
EXPOSE 12200

# The application's jar file
ARG JAR_FILE=target/boot/sofaboot-start-web-1.0.0-SNAPSHOT-executable.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]