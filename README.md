
# 🎮 Projeto Catálogo de Games

Este projeto é um Back End desenvolvido com Spring Boot para gerenciar um catálogo de jogos.
A API permite listar, buscar e organizar jogos, criei uma funcionalidade onde é possivel reordenar a posição dos jogos em uma lista.
Para o banco de dados utilizei o H2 para os perfis de desenvolvimento e teste, e para o perfil de produção utilizei PostgreSQL.

---

 ## 🛠️ Estrutura do Projeto
- **Controller - Responsável por receber requisições da API.
- **Service - A lógica para realizar a manipulação dos jogos no catálogo.
- **Repository - Camada de acesso ao Banco de dados utilizando **Spring Data JPA**.
- **DTO(Data Tranfer Object) Define classes para Transferência de dados entre API e o cliente.
- **Entities - Representa as tabelas do banco de dados e seus relacionamentos.

--- 

## 🚀 Tecnologias Utilizadas

- **Java 21** com **Spring Boot**
- **Spring Data JPA** (ORM)
- **Banco de Dados:** PostgreSQL(produção) e H2 (desenvolvimento e teste).
- **Docker Compose** (para ambiente local)
- **Projections** para consultas otimizadas
- **CORS** configurado para segurança

---

## 🔥 Funcionalidades Implementadas

✅ Desenvolvimento de uma API RESful para gerenciamento de jogos.
✅ Funcionalidade para reordenar a posição dos jogos em uma lista
✅ Integração com banco de dados PostgreSQL utilizando Docker
✅ Implementação de validações de dados
✅ Utilização de funções avançadas do Spring Boot

---

## 📌 EndPoints
### 🔎 **Procurando um jogo pelo ID**:
📌 **GET** /games{id}   
http://localhost:8080/games/2
![image](https://github.com/user-attachments/assets/e49d41dd-03a2-4277-919a-ab55a76a90da)

📋 **Listar jogos em uma determinada lista**:
📌 **GET** /lists/{id}/games
http://localhost:8080/lists/2/games
![image](https://github.com/user-attachments/assets/fbfafd7a-b667-4a4d-b5a1-6cdf99e5492a)

🔄 **Mover o jogo de posição dentro de uma lista**:
📌POST /lists/{id}/replacement
http://localhost:8080/lists/2/replacement
![image](https://github.com/user-attachments/assets/71bb6bb8-b70e-47e7-b37a-9b10bb7d9370)

📜 **Listar a listas de jogos**
📌 GET /lists
http://localhost:8080/lists

![image](https://github.com/user-attachments/assets/ac122bcb-0263-4700-a353-b6a82ffb76dc)




