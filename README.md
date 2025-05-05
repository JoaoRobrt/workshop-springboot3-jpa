# Projeto Web Services com Spring Boot

# Sobre o projeto

Este projeto é uma aplicação web construída com **Spring Boot** e **JPA/Hibernate**, com o objetivo de desenvolver um serviço web RESTful completo, seguindo boas práticas de arquitetura em camadas e utilizando banco de dados relacional.

O projeto foi desenvolvido com fins educacionais, abordando os principais conceitos do desenvolvimento back end com Java, como: modelo de domínio, camadas lógicas, persistência de dados e tratamento de exceções.

## Objetivos do projeto

- Criar projeto Spring Boot Java  
- Implementar modelo de domínio  
- Estruturar camadas lógicas: `resource`, `service`, `repository`  
- Configurar banco de dados de teste (H2)  
- Povoar o banco de dados  
- Implementar operações CRUD: Create, Retrieve, Update, Delete  
- Realizar tratamento adequado de exceções  

## Modelo conceitual

### Domain Model
![Modelo Conceitual 1](https://github.com/JoaoRobrt/workshop-springboot3-jpa/blob/main/api-ecomerce/assets/modelo-conceitual-1.png?raw=true)

### Domain Instance
![Modelo Conceitual 2](https://github.com/JoaoRobrt/workshop-springboot3-jpa/blob/main/api-ecomerce/assets/modelo-conceitual-2.png)

# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- Banco H2 (ambiente de testes)
- PostgreSQL (produção)

## Implantação em produção
- Banco de dados: PostgreSQL

# Como executar o projeto

## Pré-requisitos
- Java 17
- Maven

# Autor

João Roberto Galvão de Oliveira  
[https://www.linkedin.com/in/joão-roberto-415584206/](https://www.linkedin.com/in/joão-roberto-415584206/)


```bash
# clonar repositório
git clone https://github.com/JoaoRobrt/workshop-springboot3-jpa.git

# entrar na pasta do projeto
cd seu-repositorio

# executar o projeto
./mvnw spring-boot:run


