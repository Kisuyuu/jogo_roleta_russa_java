# jogo_roleta_russa_java
Jogo de Roleta Russa em Java executado no terminal, desenvolvido com foco em lógica, algoritmos e probabilidade. Possui modo contra CPU, multiplayer local para 2 jogadores e estrutura orientada a objetos. Projeto criado para treinar raciocínio lógico e futuramente receber interface gráfica.

# Jogo de Roleta Russa em Java

Projeto desenvolvido em **Java** para ser executado no terminal, simulando um jogo de **Roleta Russa** com foco em **lógica de programação, algoritmos, probabilidade e orientação a objetos**.

---

## Sobre o Projeto

A proposta deste projeto foi criar um jogo onde a principal dificuldade fosse o **raciocínio lógico**, e não apenas escrever código repetitivo.

Roleta Russa é um excelente exercício para treinar:

- Aleatoriedade  
- Estrutura de decisão  
- Loops  
- Estados do jogo  
- Organização em classes  
- Probabilidade

---

## Tecnologias Utilizadas

- Java  
- Programação Orientada a Objetos (POO)  
- Eclipse IDE  
- Terminal / Console

---

## Modos de Jogo

### 1. Jogar contra CPU

O jogador puxa o gatilho e o sistema decide aleatoriamente se a bala dispara.

### 2. Multiplayer Local (2 Jogadores)

Dois jogadores se revezam apertando Enter para puxar o gatilho até alguém perder.

### 3. Sair

Encerra o programa.

Função de Cada Classe

Main.java
Responsável por:

*Menu principal
*Escolha do modo de jogo
*Fluxo geral do programa

algoritmo.java
Classe base responsável por:

*Gerar números aleatórios
*Simular sorteios

jogador.java
Representa cada jogador:

*Nome
*Estado de vida

juiz.java
Controla a arma:

*Tambor do revólver
*Posição da bala
*Verificação de disparo
*Reset da arma

Conceitos Praticados

Durante este projeto foram utilizados:

*switch case
*while
*if / else
*Classes e objetos
*Herança
*Encapsulamento
*Scanner
*Random
*Métodos personalizados
*Controle de fluxo

Como Executar
1.Abra no Eclipse ou outra IDE Java
2.Execute o arquivo:
3.Main.java
4.Jogue pelo terminal.

Exemplo de Execução
=== ROLETA RUSSA v1.0 ===
1 - Jogar contra CPU
2 - Multiplayer Local (2 Jogadores)
3 - Sair
Escolha o modo:
Objetivo do Projeto

Este projeto foi criado para fortalecer:

*Lógica de programação
*Organização de código em múltiplas classes
*Simulação de sistemas aleatórios
*Pensamento algorítmico

Melhorias Futuras:
*Interface gráfica (Java Swing / JavaFX)
*Sons e efeitos visuais
*Ranking de vitórias
*Modo online
*Inteligência artificial avançada

Autor

Desenvolvido por Kisuyu Asuy como projeto de estudos e portfólio.

---

## Estrutura do Projeto

```bash
roletaRussa_jogo/
└── src/
    └── roletaRussa_jogo/
        ├── algoritmo.java
        ├── jogador.java
        ├── juiz.java
        ├── Main.java
        └── module-info.java


        
