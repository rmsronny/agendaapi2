# agenda
Agenda de Compromissos

API REST para gerenciamento de compromissos

## Como rodar ##
1. Pre requisito: Java 21+, Maven 4.0+
2. Clone pelo link: https://github.com/rmsronny/agendaapi.git
3. Execute: 'mvn spring-boot:run'
4. Acesso: '[http://localhost:8080](http://localhost:8080/)'
- ** H2 - Console
'http://localhost:8080/h2-console'
## Endpoints ##
POST - localhost:8080/api/agenda
GET -  localhost:8080/api/agenda/id
GET -  http://localhost:8080/agenda
## Decisões Técnicas ##
Framework: Spring Boot
Banco: H2
Arquitetura: Controlle, Repository, Service, Expection
