
# 💼 Sistema de Portfólio - Arquitetura de Microserviços com Spring Boot

Este projeto é uma aplicação de **portfólio pessoal** desenvolvida com **Java 17**, utilizando o **Spring Boot** com **arquitetura hexagonal** e **microserviços**. A infraestrutura é totalmente **dockerizada**, com autenticação centralizada via **Keycloak**, descoberta de serviços com **Eureka**, e configuração centralizada com o **Spring Cloud Config**.

---

## 📦 Visão Geral da Arquitetura

```
[ Frontend (em desenvolvimento) ]
         |
         v
+----------------------+
|  API Gateway         |
+----------+-----------+
           |
+----------v-----------+
|   Discovery Service  |
+----------+-----------+
           |
+----------------------------+
|     Config Server          |
|    (spring cloud config)   |
+-----+--------------+-------+
      |              |
+-----v----+     +---v------+
| Usuário  |     | Portfólio|
| Service  |     | Service  |
+----------+     +----------+
      |               |
+-----v----+     +----v-----+
| PostgreSQL |   | PostgreSQL|
+------------+   +----------+
```

---

## 🚀 Tecnologias Utilizadas

- ✅ **Java 17 + Spring Boot**
- ✅ **Arquitetura Hexagonal (Ports & Adapters)**
- ✅ **Spring Cloud:**
  - Config Server
- ✅ Eureka Discovery
- ✅ **Keycloak** (OAuth2/JWT)
- ✅ **PostgreSQL**
- ✅ **Docker + Docker Compose**
- ✅ **Maven**

---

## 🧱 Microserviços

| Serviço             | Porta | Função                                 |
|---------------------|-------|----------------------------------------|
| `gateway-service`   | 8083  | API Gateway central                    |
| `discovery-service` | 8761  | Descoberta de serviços (Eureka)        |
| `usuario-service`   | 8081  | Gerenciamento de usuários              |
| `portifolio-service`| 8084  | Cadastro e exibição de projetos        |
| `keycloak`          | 8082  | Autenticação e autorização             |

---

## 🗃️ Banco de Dados

Cada microserviço possui seu **próprio banco de dados PostgreSQL**, garantindo **isolamento entre domínios**:

- `usuario-db`
- `portifolio-db`

---

## 🔐 Segurança com Keycloak

- Usuários e roles são gerenciados via painel Keycloak
- Os microserviços validam JWT emitidos pelo Keycloak
- Cada requisição aos serviços protegidos deve conter o token no header `Authorization: Bearer <token>`

---

## 🐳 Executando com Docker Compose

### Pré-requisitos:
- Docker
- Docker Compose

### Passos:

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/portifolio-system.git
cd portifolio-system

# Suba os containers
docker-compose up --build
```

---

## 📂 Estrutura de Pastas

```
portifolio-system/
├── discovery-service/
├── gateway-service/
├── usuario-service/
├── portifolio-service/
├── docker-compose.yml
├── .env
└── README.md
```

---

## 🧪 Como Acessar os Serviços

| Serviço         | URL                             |
|-----------------|----------------------------------|
| Eureka          | http://localhost:8761           |
| Keycloak        | http://localhost:8082           |
| Usuário Service | http://localhost:8081           |
| Portfólio       | http://localhost:8084           |
| Gateway         | http://localhost:8083           |

---

## 📌 Melhorias Futuras

- [ ] Criar Frontend com React/Angular
- [ ] CI/CD com GitHub Actions
- [ ] Integração com Prometheus/Grafana
- [ ] Testes de Integração e Contrato

---

## 👤 Autor

Desenvolvido por **[Lincoln Caetano Dias]**  
🔗 GitHub: [https://github.com/lincolncaetano](https://github.com/lincolncaetano)  
✉️ Contato: lincolncaetano@gmail.com

---

---

💡 Projeto feito com fins educacionais para demonstrar conceitos modernos de arquitetura com Java.


## ⚖️ Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais detalhes.
