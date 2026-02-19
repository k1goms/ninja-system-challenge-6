# 🥷 Ninja System

Aplicação desenvolvida em **Java puro**, executada via console, com o objetivo de praticar estruturas de dados, organização em camadas e boas práticas de Programação Orientada a Objetos.

O sistema gerencia uma lista de ninjas utilizando `LinkedList`, aplicando validações, ordenações com `Comparator`, uso de `Enum`, `DTO`, `Stream API` e exceções personalizadas.

---

## 🎯 Objetivo do Projeto

Este projeto foi criado para consolidar fundamentos importantes do Java, como:

- Organização em camadas (Controller, Service, Model)
- Manipulação de `LinkedList`
- Uso de `Enum` com `Comparator`
- Conversão entre Entity e DTO
- Validações e tratamento de exceções
- Uso de `Stream API`
- Aplicação de conceitos de Programação Orientada a Objetos
- Separação de responsabilidades

---

## 📌 Funcionalidades

O sistema permite:

- 📄 Listar todos os ninjas
- ➕ Adicionar ninja no início da lista
- ➕ Adicionar ninja no final da lista
- ❌ Remover o primeiro ninja (com confirmação)
- 🔎 Buscar ninja pelo nome
- 🔢 Buscar ninja pelo índice
- 🔄 Ordenar ninjas por:
    - Nome
    - Idade
    - Vila

---

## 🏗 Arquitetura do Projeto

O projeto foi organizado em camadas para manter o código limpo e organizado:

controller → controla fluxo e entrada do usuário
service → contém regras de negócio
model → entidades e DTO
util → menu e dados iniciais
exception → exceção personalizada
enums → opções de ordenação


### 🔹 Controller
Responsável por:
- Ler entradas do usuário
- Controlar o fluxo da aplicação
- Chamar a camada de serviço

### 🔹 Service
Responsável por:
- Regras de negócio
- Validações
- Manipulação da lista
- Conversão entre `Ninja` e `NinjaDTO`
- Ordenação
- Lançamento de exceções

### 🔹 Model
- `Ninja` → Entidade principal
- `NinjaDTO` → Record utilizado para transferência de dados

---

## 📂 Estrutura de Pastas

src
├── controller
│ └── NinjaController
├── service
│ └── NinjaService
├── model
│ ├── Ninja
│ └── NinjaDTO
├── enums
│ └── SortOption
├── exception
│ └── NinjaNotFoundException
├── util
│ ├── Menu
│ └── SampleData
└── App (classe principal)


---

## 🧠 Conceitos Técnicos Aplicados

- Java Records (`record`)
- `LinkedList`
- `Comparator`
- `Enum`
- `Stream API`
- Exceção personalizada (`RuntimeException`)
- Interface funcional (`Consumer`)
- Encapsulamento
- Separação de responsabilidades
- Validação defensiva

---

## ▶ Como Executar

1. Clone o repositório
2. Abra o projeto em sua IDE (IntelliJ, Eclipse ou VS Code)
3. Execute a classe `App`
4. Utilize o menu interativo no console

---

## 📊 Dados Iniciais

O sistema inicia com ninjas pré-carregados:

- Naruto
- Sakura
- Sasuke
- Kakashi
- Tsunade
- Gaara
- Temari

---

## 👨‍💻 Autor

Kauã Gomes  
Desenvolvedor Back-End Java  
