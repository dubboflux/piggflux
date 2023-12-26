FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <syuqtat@syuqtat.com>

ADD ./target/notification-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/notification-service.jar"]

EXPOSE 8000