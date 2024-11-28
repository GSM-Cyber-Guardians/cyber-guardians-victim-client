FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENV TZ=Asia/Seoul
CMD ["java", "-jar", "app.jar"]