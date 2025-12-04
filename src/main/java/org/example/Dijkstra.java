package org.example;

import java.util.*;

public class Dijkstra {

    public static void menorCaminho(GrafoRotas grafo, String origem, String destino) {

        Map<String, Map<String, Integer>> adj = grafo.getAdj();

        Map<String, Integer> dist = new HashMap<>();
        Map<String, String> anterior = new HashMap<>();

        PriorityQueue<String> fila = new PriorityQueue<>(
                Comparator.comparingInt(dist::get)
        );

        // Inicialização
        for (String cidade : adj.keySet()) {
            dist.put(cidade, Integer.MAX_VALUE);
            anterior.put(cidade, null);
        }

        dist.put(origem, 0);
        fila.add(origem);

        while (!fila.isEmpty()) {
            String atual = fila.poll();

            if (atual.equals(destino)) break;

            for (String vizinho : adj.get(atual).keySet()) {
                int peso = adj.get(atual).get(vizinho);
                int novaDist = dist.get(atual) + peso;

                if (novaDist < dist.get(vizinho)) {
                    dist.put(vizinho, novaDist);
                    anterior.put(vizinho, atual);
                    fila.add(vizinho);
                }
            }
        }

        // Recuperação do caminho
        if (dist.get(destino) == Integer.MAX_VALUE) {
            System.out.println("Não existe caminho entre " + origem + " e " + destino);
            return;
        }

        List<String> caminho = new ArrayList<>();
        String atual = destino;

        while (atual != null) {
            caminho.add(atual);
            atual = anterior.get(atual);
        }

        Collections.reverse(caminho);

        System.out.println(">>> Menor caminho de " + origem + " até " + destino + ":");
        System.out.println(String.join(" -> ", caminho));
        System.out.println("Distância total: " + dist.get(destino) + " km");
    }
}

