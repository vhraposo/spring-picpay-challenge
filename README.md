# Desafio Back-end PicPay

#### Desafio criado para estudos, o guia de requisitos pode ser encontrado no [Link](https://github.com/PicPay/picpay-desafio-backend)

### Tecnologias

- Java 17 ☕
- SpringBoot 3 🍃
- H2 Database 🎲
- Lombok 🛡️

### Endpoint de transferência

```shell
    POST /transactions
    Content-Type: application/json

    {
    "senderId": 2,
    "receiverId": 1,
    "value": 1
    }
```

### Endpoint de cadastro

```shell
    POST /users
    Content-Type: application/json

    {
    "firstName": "Victor",
    "lastName": "Raposo",
    "password": "senha",
    "document": "122211782",
    "email": "victor@email.com",
    "userType": "COMMON",
    "balance": 10
    }
```

### Endpoint de listagem de usuários

```shell
    POST /users
    Content-Type: application/json
```

## Como executar

- Clone o repositório do projeto:

```shell
    gh repo clone vhraposo/spring-picpay-challenge
```

- Acesse a pasta do projeto e execute o comando para instalar as dependências:

```shell
mvn install
```

- Execute o comando para iniciar a aplicação:

```shell
mvn spring-boot:run
```

- A API estará disponível para receber requisições em <http://localhost:8080/>

## Licença

Este projeto está licenciado sob a licença MIT.
