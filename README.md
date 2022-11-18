# fiap-backend-befic

Backend feito para o app Android BeFic criado no curso de Análise e Desenvolvimento de Sistemas da FIAP.

## Tecnologias

Tecnologias utilizadas:

* Java 11
* Spring Framework
* Maven
* MySQL Database
* Mongo Database
* Docker e Docker desktop

## Serviços Utilizados

* Github
* Postman
* Flyway

## Getting started - Rodando localmente

Faça o download ou clone este projeto e abra em uma IDE (preferencialmente IntelliJ).
É preciso ter o Java 11 e Docker instalado na máquina.

1. Prepare sua IDE colocando o Java 11 nas configurações do projeto 
2. Aguarde a instalação das dependências
3. Migre para a pasta local-infra-befic e, no terminal, execute o comando:
   ```docker-compose-up```
      
   
    Um container com um banco de dados MySQL e um MongoDB serão inicializados nas portas 3326 e 27017 respectivamente.
4. Abra a classe BeFicApplication e execute a aplicação.
   

     Migrações serão executadas pelo Flyway originando as tabelas o banco de dados e inserindo dados iniciais para facilitar a utilização do app.

5. Clone o projeto https://github.com/GHBAlbuquerque/befic_kotlin_fiap e siga as instruções no readme


## Versioning

1.0.0.0


## Authors

* **Giovanna Albuquerque**: @GHBAlbuquerque (https://github.com/GHBAlbuquerque)
* RM 86947