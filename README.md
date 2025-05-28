# 💳 Sistema de Notificações Bancárias (Padrão Observer)

Este projeto é uma implementação simples do padrão de projeto **Observer** em Java. Ele simula um sistema de notificações onde clientes são notificados sobre transações bancárias.

## 🛠 Tecnologias
- Java 17+
- Padrão de Projeto: Observer
- Paradigma: Orientação a Objetos

## 📦 Estrutura

- `Observer`: Interface que define a estrutura de um observador.
- `Cliente`: Classe que implementa `Observer` e representa o cliente que será notificado.
- `Subject`: Interface para os objetos observáveis.
- `Banco`: Implementa `Subject` e representa o sistema bancário que envia as notificações.
- `Main`: Classe principal com exemplo de uso.

## 🚀 Execução

```bash
javac Main.java
java Main
