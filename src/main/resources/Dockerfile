From openjdk:8

ENV JAEGER_AGENT_HOST=jaeger

COPY OrderService-1.0.0.jar /opt/OrderService-1.0.0.jar

CMD ["java", "-jar", "/opt/OrderService-1.0.0.jar"]