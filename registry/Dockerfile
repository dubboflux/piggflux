FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <syuqtat@syuqtat.com>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761