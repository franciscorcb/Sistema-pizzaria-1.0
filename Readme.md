# Trabalho de LP2 - Linguagem de Programação 2

**Aluno:** Francisco Roberto  
**Professor:** Geraldo Braz  

Este projeto foi desenvolvido como parte da disciplina **Linguagem de Programação 2 (LP2)**. O objetivo é aplicar os conceitos de **Programação Orientada a Objetos (POO)**, incluindo relacionamento entre classes.  

O programa simula um sistema de Pizzaria que recebe informações como:  
- Nome e sabores das pizzas;  
- Método de entrega (delivery ou retirada).  

Caso o pedido seja por delivery, o sistema simula um **tempo de entrega** gerado aleatoriamente por uma função.

## Tecnologias Utilizadas
- **Linguagem:** Java  
- **IDE:** Visual Studio Code (VS Code)  
- **Bibliotecas:** `java.util.Random` e `java.util.Scanner`  

## Como usar

```java
// Exemplo de configuração de pizza e cliente:
pizza[0] = new Pizza(5, 3, 1); 
// 5: primeiro sabor, 3: segundo sabor, 1: quantidade

cliente[0] = new Cliente("Francisco", "Rua das Flores, 123", true); 
// "Francisco": nome do cliente, "Rua das Flores, 123": endereço, true: entrega via delivery

// Criando o pedido e gerando a nota fiscal:
Pedido pedido = new Pedido(cliente[0], pizza[0]); 
pedido.notaFiscal(); 
// Exibe o resultado dos dados cadastrados em pizza[0] e cliente[0]
