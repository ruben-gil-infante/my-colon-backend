# My Colon (back-end)

_Aplicació desenvolupada per al treball de fi de grau_

## Inici

_Aquestes instruccions et permetràn obtenir una còpia del projecte en funcionament a la teva màquina en local per propòsits de desenvolupament i proves._

Mira **Deployment** per coneixer com fer el desplegament del projecte.

### Pre-requisits 📋

_Cal tenir instal·lat el següent:_

* [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* [Spring Framework](https://spring.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)

## Desplegament 📦

_Per realitzar el desplegament cal executar la següent comanda_
```
mvn spring-boot:run
```
_Aplicació desplegada també a Heroku_ 
* [Desplegament a Heroku](https://my-colon-server.herokuapp.com/)

## Construït amb 🛠️

* [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* [Spring Framework](https://spring.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)


## Autor ✒️

* **Rubén Gil** - [rgili](https://github.com/rgili)

## Altres 😺
Conté una base de dades amb dos usuaris registrats per tal de facilitar les proves

* Usuari (correu electrònic: usuari@usuari.com, contrasenya: usuari)
* Usuari 2 (correu electrònic: metge@metge.com, contrasenya: metge)

A l'arxiu application.properties:

Per utilitzar la base de dades H2
```
# H2 database settings
spring.datasource.url=jdbc:h2:mem:./data
spring.datasource.driverClassName=org.h2.Driver
spring.h2.console.settings.web-allow-others=true

# Hibernate database settings
# spring.jpa.hibernate.ddl-auto=none
# spring.datasource.url=jdbc:h2:file:./database;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE


# Hibernate dialect
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect


# Datasource user settings
spring.h2.console.enabled=true
spring.datasource.platform=none
spring.datasource.username=sa
# spring.datasource.password=password

# Avoid problems duplicating the password encoder bean
spring.main.allow-bean-definition-overriding=true


server.port=8080


spring.application.name=myColonServer
```
Per utilitzar la base de dades postgress:
```
# H2 database settings
# spring.datasource.url=jdbc:h2:mem:./data
# spring.datasource.driverClassName=org.h2.Driver
# spring.h2.console.settings.web-allow-others=true

# Hibernate database settings
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:h2:file:./database;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE


# Hibernate dialect
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect


# Datasource user settings
spring.h2.console.enabled=true
spring.datasource.platform=none
spring.datasource.username=sa
# spring.datasource.password=password

# Avoid problems duplicating the password encoder bean
spring.main.allow-bean-definition-overriding=true


server.port=8080


spring.application.name=myColonServer
```
