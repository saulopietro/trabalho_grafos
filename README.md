# 🌐 Trabalho de Grafos – Grafo de Rotas com Dijkstra

## 📌 Descrição do Projeto
Este projeto implementa um **Grafo de Rotas** representando cidades conectadas por estradas com distâncias (pesos).  
O sistema permite adicionar/remover vértices e arestas, exibir o grafo e calcular o **menor caminho** entre duas cidades utilizando o **Algoritmo de Dijkstra**.

O objetivo é demonstrar o uso de estruturas de grafos e algoritmos clássicos para resolver problemas reais, como rotas urbanas e planejamento de trajetos.

---

## 🧠 Problema Resolvido
Dado um conjunto de cidades e as distâncias entre elas, o sistema deve:

- Representar esse conjunto como um grafo ponderado não-direcionado.
- Mostrar todas as conexões entre as cidades.
- Calcular o menor caminho entre uma origem e um destino usando Dijkstra.
- Retornar o caminho completo e a distância total.

---

## 🛠️ Linguagem e Versão
- **Java 17+** (funciona também em Java 11)
  
---

## ▶️ Como Executar

### **1. Compilar o projeto**
A partir da raiz do repositório:

```bash
javac src/main/java/org/example/*.java -d out
```

### **2. Rodar o programa**
```bash
java -cp out org.example.Main
```
###📤 Exemplo de Entrada (no código)
```bash
grafo.adicionarAresta("Natal", "Parnamirim", 20);
grafo.adicionarAresta("Natal", "Ceará-Mirim", 35);
grafo.adicionarAresta("Parnamirim", "São Gonçalo", 25);
grafo.adicionarAresta("Ceará-Mirim", "São Gonçalo", 18);
grafo.adicionarAresta("São Gonçalo", "Macaíba", 12);
grafo.adicionarAresta("Macaíba", "Natal", 30);

Dijkstra.menorCaminho(grafo, "Natal", "Macaíba");
```
###📥 Exemplo de Saída
```bash
===== GRAFO DE ROTAS =====
Natal -> {Parnamirim=20, Ceará-Mirim=35, Macaíba=30}
Parnamirim -> {Natal=20, São Gonçalo=25}
Ceará-Mirim -> {Natal=35, São Gonçalo=18}
São Gonçalo -> {Parnamirim=25, Ceará-Mirim=18, Macaíba=12}
Macaíba -> {São Gonçalo=12, Natal=30}
==========================

>>> Menor caminho de Natal até Macaíba:
Natal -> São Gonçalo -> Macaíba
Distância total: 32 km

```
