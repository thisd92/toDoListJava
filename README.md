# toDoListJava

Este repositório contém um projeto Java/Spring com frontend em Thymeleaf para gerenciar uma To Do List, com operações CRUD (Create, Read, Update, Delete) para tarefas.

## Descrição do Projeto

O projeto `toDoListJava` é uma aplicação Java/Spring que utiliza Thymeleaf como template engine para fornecer um frontend interativo para gerenciar uma lista de tarefas (To Do List). Implementa um padrão MVC (Model-View-Controller) onde:

- **Model**: Define as entidades de dados (como Tarefa) utilizando JPA para persistência.
- **View**: Utiliza Thymeleaf para renderizar as páginas HTML dinamicamente.
- **Controller**: Implementa os endpoints RESTful para realizar operações CRUD nas tarefas.

### Funcionalidades

- **Cadastro de Tarefas**: Permite adicionar novas tarefas à lista.
- **Listagem de Tarefas**: Exibe todas as tarefas cadastradas.
- **Atualização de Tarefas**: Permite editar o conteúdo das tarefas existentes.
- **Exclusão de Tarefas**: Permite remover tarefas da lista.

### Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Framework**: Utilizado para construir e configurar a aplicação web.
- **Thymeleaf**: Template engine para renderização de páginas HTML.
- **Spring Data JPA**: Facilita o acesso e a manipulação dos dados com o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Maven**: Gerenciador de dependências e construção do projeto.

## Configuração do Ambiente de Desenvolvimento

### Pré-requisitos

- JDK 11 ou superior
- Maven
- IDE Java (por exemplo, IntelliJ IDEA, Eclipse)

### Executando o Projeto

1. Clone o repositório para sua máquina local.
2. Importe o projeto em sua IDE Java.
3. Execute a aplicação Spring Boot.

Acesse a aplicação em `http://localhost:8099` e você poderá gerenciar suas tarefas na To Do List.

## Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 em memória para desenvolvimento e testes. Não são necessárias configurações adicionais além das padrões do Spring Boot para começar a utilizar o projeto.

### Contribuição

Contribuições são bem-vindas! Se deseja contribuir com este projeto:

1. Faça um fork do repositório.
2. Crie uma branch com suas alterações: `git checkout -b minha-feature`.
3. Commit suas mudanças: `git commit -m 'Adiciona nova feature'`.
4. Push para a branch: `git push origin minha-feature`.
5. Crie um novo pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

---

Qualquer dúvida ou problema, sinta-se à vontade para abrir uma issue neste repositório.
