#Trabalho de LP2 - Linguagem de programação 2
Aluno:Francisco Roberto
Professor: Geraldo Braz

Este projeto foi desenvolvido como parte da disciplina Linguagem de Programação 2 (LP2). Tem como objetivo aplicar os conceitos aprendidos de programação orientada a objetos (POO) e relacionamento e classes.

O programa simula um sistema de Pizzaria que recebe os valores como nome, os sabores das pizzas, se o pedido deverá ser
por meio de delivery(Caso seja, irá simular um tempo de entrega gerado aleatoriamente por uma função).

#Tecnologias Utilizadas
Linguagem : Java
IDE: VS Code
Bibliotecas:java.util.Random e java.util.Scanner

Como usar:
pizza[0] = new Pizza(5,3, 1);// 5 será o primeiro sabor, 3 será o meu segundo sabor e 1 é quantidade
cliente[0] = new Cliente("Francisco", "Rua das Flores, 123", true);// o primeiro será o nome do cliente, local que será entregue e por ultimo se vai ser delivery(Caso seja false, vai desconsiderar o endereço)

Pedido pedido = new Pedido(cliente[0], pizza[0]);//O sistema trata as informações para a nota fiscal exibir
pedido.notaFiscal();//exibe o resultado dos dados cadastrados em pizza[0] e cliente[0]
