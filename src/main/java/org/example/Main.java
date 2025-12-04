package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        GrafoRotas grafo = new GrafoRotas();

        // Exemplo de cidades e distâncias
        grafo.adicionarAresta("Natal", "Parnamirim", 20);
        grafo.adicionarAresta("Natal", "Ceará-Mirim", 35);
        grafo.adicionarAresta("Parnamirim", "São Gonçalo", 25);
        grafo.adicionarAresta("Ceará-Mirim", "São Gonçalo", 18);
        grafo.adicionarAresta("São Gonçalo", "Macaíba", 12);
        grafo.adicionarAresta("Macaíba", "Natal", 30);

        grafo.exibirGrafo();

        // Executando Dijkstra
        Dijkstra.menorCaminho(grafo, "Natal", "Macaíba");
    }
}

