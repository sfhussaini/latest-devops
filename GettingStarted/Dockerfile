# Use an official OpenJDK 17 image as a base image
FROM openjdk:17-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY target/GettingStarted-0.0.1-SNAPSHOT.jar /app/GettingStarted-0.0.1-SNAPSHOT.jar

# Expose the port your application will run on (e.g., 8080 if your app uses it)
EXPOSE 8080

# Command to run your JAR file when the container starts
CMD ["java", "-jar -Dserver.port=8080", "GettingStarted-0.0.1-SNAPSHOT.jar"]
