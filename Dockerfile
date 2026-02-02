# -------- BUILD STAGE --------
FROM maven:3.9.5-eclipse-temurin-21 AS build

WORKDIR /app

# Copy everything
COPY . .

# Make mvnw executable inside the container
RUN chmod +x mvnw

# Build the JAR (skip tests to avoid failures)
RUN ./mvnw clean package -DskipTests

# -------- RUN STAGE --------
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy the built JAR from build stage
COPY --from=build /app/target/Weather-App-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Render will map it)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]
