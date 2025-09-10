# DailyTasks

Este projeto é o back-end de um sistema de gerenciamento de tarefas diárias, desenvolvido com **Java** e **Spring Boot**. A aplicação permite manipular um banco de dados PostgreSQL por meio de requisições HTTP, oferecendo funcionalidades como criação, atualização, listagem e exclusão de tarefas.

> ⚠️ Projeto em fase inicial.

## Funcionalidades

- Criar contas de usuário;
- Autenticar usuários;
- Criar, editar e excluir tarefas;
- Atribuir categorias às tarefas;
- Definir status para cada tarefa (pendente, concluída, etc.);
- Consultar tarefas por status ou categoria.

## Tecnologias utilizadas

- Java 21;
- Spring Boot;
- Spring Data JPA;
- Spring Security;
- PostgreSQL;
- Lombok;
- Maven.

## Arquitetura do projeto

O projeto segue a arquitetura em camadas:

- **Model**: entidades JPA que representam as tabelas do banco;
- **Repository**: interfaces que acessam os dados via Spring Data JPA;
- **Service**: camada de lógica de negócio;
- **Controller**: endpoints REST para comunicação com o front-end ou ferramentas externas.

## Estrutura do banco de dados

O banco é composto por cinco tabelas principais:

- `conta`: representa o usuário autenticado;
- `tarefa`: representa uma tarefa vinculada a uma conta;
- `categoria`: opcional, usada para agrupar tarefas;
- `status_tarefa`: tabela fixa com os status possíveis (somente leitura);
- `usuario`: perfil vinculado a uma conta.

## Como executar o projeto

### 1. Pré-requisitos

- Java 21 instalado;
- PostgreSQL rodando localmente;
- Maven instalado.

### 2. Configuração do banco de dados

- Crie um novo banco de dados no seu servidor PostgreSQL com o nome `gerenciador_de_tarefas`;
- Execute o script SQL do [gerenciador_de_tarefas.sql](/sql/gerenciador_de_tarefas.sql) neste banco de dados para criar todas as tabelas e inserir os dados iniciais da tabela `status_tarefa`.

### 3. Configuração de conexão

Para configurar a conexão com o banco de dados, vá no arquivo [application-example.properties](/src/main/resources/application-example.properties), renomeie o arquivo para `application.properties` e troque os campos com os seus dados reais.

### 4. Execução

1. Abra a sua IDE;
2. Navegue até a classe `DailytasksApplication.java`, localizada em: `/src/main/java/com/todolist/dailytasks/DailytasksApplication.java`;
3. Clique no ícone de play ao lado da declaração da classe para iniciar a aplicação;
4. Após a execução, o sistema estará rodando localmente na porta 8080, portanto, acesse a seguinte URL no navegador: `http://localhost:8080`

## Estrutura de diretórios
```
.
├── sql                                         # Scripts SQL para criação e inserção no banco
├── src
│   ├── main
│   │   ├── java/com/todolist/dailytasks
│   │   │   ├── configuration/                  # Configurações globais da aplicação (ex: segurança, CORS, beans)
│   │   │   ├── controller/                     # Endpoints REST que recebem requisições HTTP
│   │   │   ├── exceptions/                     # Classes de exceções personalizadas e tratamento global
│   │   │   ├── model/                          # Entidades JPA que representam as tabelas do banco
│   │   │   ├── repository/                     # Interfaces que acessam o banco via Spring Data JPA
│   │   │   ├── service/                        # Camada de serviço com regras de negócio e lógica da aplicação
│   │   │   └── DailytasksApplication.java      # Classe principal que inicia a aplicação Spring Boot
│   │   └── resources
│   │       └── application-example.properties  # Arquivo de exemplo com configurações da aplicação
├── .gitignore                                  # Lista de arquivos e pastas ignorados pelo Git
├── pom.xml                                     # Arquivo de configuração do Maven com dependências e plugins
└── README.md                                   # Documentação principal do projeto (visão geral, instruções, etc.)
```