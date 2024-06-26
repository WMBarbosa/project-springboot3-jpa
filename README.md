# Project Spring Boot 3 JPA

## Descrição

Este projeto é uma aplicação de exemplo utilizando Spring Boot 3 e JPA (Java Persistence API). Ele demonstra como configurar e utilizar estas tecnologias para construir uma aplicação CRUD básica. O projeto foi desenvolvido junto com o curso de Java Spring do professor Nelio Alves.

## Funcionalidades

- Cadastro de entidades
- Atualização de entidades
- Listagem de entidades
- Exclusão de entidades

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database (ou outra base de dados de sua preferência)
- Maven

## Requisitos

- JDK 17 ou superior
- Maven 3.8 ou superior

## Instalação

1. Clone o repositório para a sua máquina local:
   ```bash
   git clone https://github.com/WMBarbosa/project-springboot3-jpa.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd project-springboot3-jpa
   ```

3. Compile o projeto utilizando o Maven:
   ```bash
   mvn clean install
   ```

4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

## Configuração

### Banco de Dados

Por padrão, o projeto está configurado para utilizar o banco de dados H2 em memória. Para alterar para outro banco de dados, atualize as configurações no arquivo `src/main/resources/application.properties`.

Exemplo de configuração para o MySQL:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sua_base_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
```

### Endpoints

A aplicação expõe endpoints RESTful para manipulação das entidades. Exemplos de endpoints incluem:

- `GET /entidades` - Listar todas as entidades
- `GET /entidades/{id}` - Obter uma entidade pelo ID
- `POST /entidades` - Criar uma nova entidade
- `PUT /entidades/{id}` - Atualizar uma entidade existente
- `DELETE /entidades/{id}` - Excluir uma entidade

## Estrutura do Projeto

```
project-springboot3-jpa
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── exemplo
│   │   │           └── projeto
│   │   │               ├── controller
│   │   │               ├── model
│   │   │               ├── repository
│   │   │               └── service
│   │   └── resources
│   │       ├── application.properties
│   └── test
│       └── java
│           └── com
│               └── exemplo
│                   └── projeto
```

- `controller`: Contém os controladores REST que lidam com as requisições HTTP.
- `model`: Contém as classes de modelo (entidades).
- `repository`: Contém as interfaces de repositório que estendem `JpaRepository`.
- `service`: Contém as classes de serviço com a lógica de negócios.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias ou correções.
