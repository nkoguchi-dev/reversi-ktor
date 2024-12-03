FROM gradle:8.7-jdk21

RUN mkdir -p /project/backend
WORKDIR /project/backend

EXPOSE 8080

CMD ["gradle", "run", "-x", "test"]