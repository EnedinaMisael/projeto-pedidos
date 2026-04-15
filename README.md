# Order Management API

Esta é uma API REST desenvolvida para o gerenciamento de um sistema de pedidos, demonstrando a implementação de um modelo de domínio com Spring Boot.

##  Tecnologias
* **Java 21**
* **Spring Boot**
* **Maven**
* **JPA / Hibernate**
* **H2 Database** (Banco de dados em memória)

## Sobre o Projeto
O sistema consiste num CRUD completo com associações entre entidades, permitindo gerir o fluxo desde a criação de um pedido até seu pagamento.

### Entidades Principais:
- **Usuários:** Gestão de perfis de clientes.
- **Pedidos:** Controle de ordens de compra e status.
- **Produtos e Categorias:** Catálogo com relacionamento muitos-para-muitos.
- **Pagamentos:** Processamento vinculado ao fecho do pedido.

### Diferenciais Técnicos:
- **Tratamento de Erros:** Implementação de exceções personalizadas (extensões de `RuntimeException`) para retornar respostas HTTP limpas e padronizadas.
- **Seed de Dados:** O projeto utiliza uma classe de teste que popula automaticamente o banco H2 com dados mockados ao iniciar a aplicação.