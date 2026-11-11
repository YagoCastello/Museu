# 🏛️ Museu API

API REST para gerenciar o acervo de um museu, desenvolvida com **Java** e **Spring Boot**. O projeto foi pensado para praticar modelagem de dados e relacionamentos entre entidades, além de versionamento de banco com migrations.

## 📌 Sobre o projeto

A API controla três entidades principais: **obras de arte**, **artistas** e **museus**. Cada obra pertence a um artista e está exposta em um museu.

Exemplo: a *Mona Lisa* (obra) foi criada por *Leonardo da Vinci* (artista) e está no *Louvre* (museu).

## 🧩 Modelo de dados

| Entidade | Descrição | Exemplo |
|----------|-----------|---------|
| **Obra** | Peça do acervo, com um tipo definido por enum | Mona Lisa |
| **Artista** | Autor das obras | Da Vinci |
| **Museu** | Local onde as obras ficam expostas | Louvre |

### Relacionamentos

- **Artista → Obra:** um artista pode ter várias obras, mas cada obra tem apenas um artista (`1:N`)
- **Museu → Obra:** um museu pode ter várias obras, mas cada obra só pode estar em um museu por vez (`1:N`)

```
Artista 1 ────── N Obra N ────── 1 Museu
```

### Tipos de obra (enum)

O tipo da obra é representado por um enum, com valores como `PINTURA`, `ESCULTURA` e outros.

## 🛠️ Tecnologias

- **Java**
- **Spring Boot 4**
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway** (versionamento do banco de dados)
- **Lombok**
- **Maven**

## ✅ Pré-requisitos

- JDK 17 ou superior
- Maven (ou use o wrapper `./mvnw` incluído no projeto)
- PostgreSQL em execução

## 🚀 Como executar

1. **Clone o repositório**

```bash
git clone https://github.com/YagoCastello/<nome-do-repositorio>.git
cd <nome-do-repositorio>
```

2. **Crie o banco de dados no PostgreSQL**

```sql
CREATE DATABASE museu;
```

3. **Configure a conexão** em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/museu
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
```

4. **Execute a aplicação**

```bash
./mvnw spring-boot:run
```

As tabelas são criadas automaticamente pelo Flyway na primeira execução, com base nos scripts em `src/main/resources/db/migration`.

A API ficará disponível em `http://localhost:8080`.

## 📂 Estrutura do projeto

```
src/main/java/saloman/yago/musuem
├── controller   # Endpoints REST
├── service      # Regras de negócio
├── repository   # Acesso ao banco (Spring Data JPA)
├── entity       # Entidades JPA (Obra, Artista, Museu)
├── enums        # Enum de tipos de obra
└── dto          # Objetos de request e response

src/main/resources
└── db/migration # Scripts SQL do Flyway
```

> Ajuste os nomes dos pacotes conforme a estrutura final do seu código.

## 🔗 Endpoints

> Ajuste esta tabela conforme os endpoints que você implementou.

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/artistas` | Lista os artistas |
| `POST` | `/artistas` | Cadastra um artista |
| `GET` | `/museus` | Lista os museus |
| `POST` | `/museus` | Cadastra um museu |
| `GET` | `/obras` | Lista as obras |
| `GET` | `/obras/{id}` | Busca uma obra por ID |
| `POST` | `/obras` | Cadastra uma obra |
| `PUT` | `/obras/{id}` | Atualiza uma obra |
| `DELETE` | `/obras/{id}` | Remove uma obra |

### Exemplo de requisição

```http
POST /obras
Content-Type: application/json

{
  "titulo": "Mona Lisa",
  "tipo": "PINTURA",
  "artistaId": 1,
  "museuId": 1
}
```

## 🎯 O que pratiquei neste projeto

- Modelagem de relacionamentos `1:N` com JPA
- Uso de enum para tipificar entidades
- Versionamento de banco de dados com Flyway
- Separação em camadas (controller, service, repository)
- Uso de DTOs para entrada e saída de dados
- Redução de código repetitivo com Lombok

## 🔮 Próximos passos

- [ ] Validações com Bean Validation
- [ ] Tratamento global de exceções
- [ ] Paginação e filtros de busca
- [ ] Testes automatizados
- [ ] Documentação com Swagger/OpenAPI
- [ ] Deploy online

## 👨‍💻 Autor

**Yago Saloman**

- GitHub: [YagoCastello](https://github.com/YagoCastello)
- LinkedIn: [yagosaloman](https://www.linkedin.com/in/yagosaloman)
