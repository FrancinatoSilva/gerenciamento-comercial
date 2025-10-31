[LICENSE__BADGE]: https://img.shields.io/github/license/Fernanda-Kipper/Readme-Templates?style=for-the-badge
[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[PRS_BADGE]:https://img.shields.io/badge/PRs-welcome-green?style=for-the-badge


<h1 align="center" style="font-weight: bold;">Gerenciamento Comercial</h1>

![license][LICENSE__BADGE]
![spring][SPRING_BADGE]
![java][JAVA_BADGE]
![prs][PRS_BADGE]

<details open="open">
<summary>Table of Contents</summary>

- [⚙ Funcionalidades](#funcoes)
    - [Como Executar](#started)
    - [Pré-requisitos](#prerequisites)
    - [Clone](#cloning)
    - [Starting](#starting)
- [📍 Endpoints da API](#routes)
    - [POST /cliente](#postc-auth-detail)
    - [POST /produto](#postp-auth-detail)

</details>

<p align="center">
  <b>Este projeto é uma API REST desenvolvida em Spring Boot para o gerenciamento
de clientes e produtos de um sistema comercial. A aplicação utiliza um banco de dados
H2 em memória para facilitar os testes e o desenvolvimento.</b>
</p>

<h2 id="funcoes">⚙ Funcionalidades Principais</h2>

**Gerenciamento de Clientes:** API completa para Criar, Ler, Atualizar e Deletar (CRUD) clientes, utilizando o ID como identificador.

**Gerenciamento de Produtos:** API completa para Criar, Ler, Atualizar e Deletar (CRUD) produtos, utilizando o SKU como identificador único.

<h2 id="starting">🚀 Como Executar</h2>

<h3 id = "prerequisites"> Pré-requisitos</h3>

- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org)

<h3 id="cloning"> Clone o Repositório</h3>

```bash
git clone https://github.com/FrancinatoSilva/gerenciamento-comercial.git
```

<h3 id = "starting"> Abra um terminal e navegue até a pasta raiz do projeto</h3>

Execute o projeto usando o Maven Wrapper

- **Em sistemas Linux ou macOS:**

```bash
./mvnw spring-boot:run
``````

- **Em sistemas Windows:**

```bash
mvnw.cmd spring-boot:run
``````

<h3>A aplicação será iniciada e estará acessível em http://localhost:8080</h3>

<h2>Acesso ao Banco de Dados (H2 Console)</h2>

**O projeto está configurado com um banco de dados H2 em memória e o console H2 está habilitado.
Você pode acessá-lo para inspecionar os dados e a estrutura das tabelas:**

- **URL do Console:** http://localhost:8080/h2-console
- **JDBC URL:** jdbc:h2:mem:gestor (Use exatamente esta URL)
- **Usuário:** natodev
- **Senha:** (deixe em branco)

<h2 id="routes">📍 Endpoints da API</h2>

<h3>Clientes</h3>

<h3 id="postc-auth-detail">Exemplo de corpo(JSON) para POST /cliente:</h3>

**REQUEST**
```json
{
  "nome": "Francinato Silva",
  "email": "francinatoireno@gmail.com"
}
```

<h3>Produtos</h3>

<h3 id="postp-auth-detail">Exemplo de corpo(JSON) para POST /produto:</h3>

**REQUEST**
```json
{
  "sku": "SKU001",
  "nome": "Notebook Gamer",
  "marca": "Marca Fictícia",
  "preco": 7500.00
}
```
