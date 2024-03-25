# Sistema de Gerenciamento de Bebidas com Padrão Builder

Este é um projeto simples que implementa um sistema de gerenciamento de bebidas em Java, incluindo uma classe `Drink` para representar bebidas e um construtor `DrinkBuilder` para facilitar a criação de objetos `Drink` utilizando o padrão de projeto Builder.

## Descrição

O código consiste em duas classes principais:

- **Drink**: Representa uma bebida e possui atributos como código, nome, ingredientes, preço, teor alcoólico, categoria, calorias, descrição e disponibilidade.
- **DrinkBuilder**: Implementa o padrão de projeto Builder para fornecer um método de construção fluente para criar objetos `Drink` com validações básicas.

## Padrão de Projeto Builder

O padrão de projeto Builder é utilizado neste projeto para facilitar a criação de objetos complexos `Drink`, permitindo a construção passo a passo e fornecendo métodos de configuração para cada atributo.

## Uso

Para usar a classe `Drink` e `DrinkBuilder`, siga estas etapas:

1. Importe o projeto em seu ambiente de desenvolvimento Java.

2. Utilize a classe `Drink` para representar informações sobre diferentes bebidas.

3. Utilize o `DrinkBuilder` para construir objetos `Drink` de forma mais conveniente, configurando cada atributo separadamente.
