# CompassSprint4

A aplicação consiste em uma API REST, foi utilizado o programa insonmia para o envio/recebimento dos dados. Para banco de dados foi usado o Mysql.

## ENDPOINTS implementados:

ASSOCIADOS:

* POST - /associados
* GET - /associados/
* GET - /associados/{id}
* PUT - /associados/{id}
* DELETE - /associados/{id}


PARTIDOS: 

* POST - /partidos
* GET - /partidos
* GET - /partidos/{id}
* PUT - /partidos/{id}
* DELETE - /partidos/{id}

### Formato de envio dos dados

![image](https://user-images.githubusercontent.com/79091246/204565940-b7b4b509-8927-4046-870b-18e672a18b45.png)

### Formato recebido dos dados:

![image](https://user-images.githubusercontent.com/79091246/204566258-cdca7bfe-ec13-435c-bf5f-ff9d3bac1e7e.png)



## Testes

Para testes foi criado o AssociadosControllerTest e o PartidosControllerTest, foram implementados os métodos GET e GET/{id} dos dois, porém não foi possível progredir mais nesse quesito, visto que, o código dava erro no result, mostrando ele como null.
