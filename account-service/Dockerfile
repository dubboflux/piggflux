FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <syuqtat@syuqtat.com>

ADD ./target/account-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

EXPOSE 6000