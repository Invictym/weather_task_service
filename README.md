#Task Weather service

Test task for junior java dev

##Local run:
###1. Set properties for DB connection in "application.properties"

    spring.datasource.url=jdbc:postgresql://localhost:5432/weather
    spring.datasource.username=postgres
    spring.datasource.password=postgres
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.jpa.database=postgresql
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL10Dialect
###2. Start service:
    mvn spring-boot:run
###3. Server will start on localhost:8080
    http://localhost:8080/weather eable enpoint(return temperature)

##In docker
###1. Build image
    docker build --tag weather-service .
###2. Start application in container
    docker-compose up
###3. Server will start on localhost:8080
    http://localhost:8080/weather eable enpoint(return temperature)


