package org.example;

import java.util.*;

public class GrafoRotas {

    private Map<String, Map<String, Integer>> adj;

    public GrafoRotas() {
        adj = new HashMap<>();
    }

    // -----------------------------
    // OPERACOES BÁSICAS DO GRAFO
    // -----------------------------

    public void adicionarVertice(String cidade) {
        adj.putIfAbsent(cidade, new HashMap<>());
    }

    public void adicionarAresta(String origem, String destino, int distancia) {
        adicionarVertice(origem);
        adicionarVertice(destino);

        adj.get(origem).put(destino, distancia);
        adj.get(destino).put(origem, distancia); // não direcionado
    }

    public void removerVertice(String cidade) {
        if (!adj.containsKey(cidade)) return;

        for (String c : adj.keySet()) {
            adj.get(c).remove(cidade);
        }
        adj.remove(cidade);
    }

    public void removerAresta(String origem, String destino) {
        if (adj.containsKey(origem)) adj.get(origem).remove(destino);
        if (adj.containsKey(destino)) adj.get(destino).remove(origem);
    }

    public Map<String, Map<String, Integer>> getAdj() {
        return adj;
    }

    public void exibirGrafo() {
        System.out.println("\n===== GRAFO DE ROTAS =====");
        for (String cidade : adj.keySet()) {
            System.out.println(cidade + " -> " + adj.get(cidade));
        }
        System.out.println("==========================\n");
    }
}

