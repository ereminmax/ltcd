package com.maxeremin.quora.graph;

import java.util.*;

public class Bigraph {
    static class Edge {
        int source, dest;

        Edge(int source, int dest) {
            this.source = source;
            this.dest = dest;
        }
    }

    static class Graph {
        List<List<Integer>> adj = null;

        Graph(List<Edge> edges, int N) {
            adj = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                adj.add(new ArrayList<>());
            }

            for (Edge edge : edges) {
                int src = edge.source;
                int dest = edge.dest;
                adj.get(src).add(dest);
                adj.get(dest).add(src);
            }
        }
    }

    public static boolean BFS(Graph graph, int v, int N) {
        boolean[] discovered = new boolean[N];
        int[] level = new int[N];
        discovered[v] = true;
        level[v] = 0;
        Queue<Integer> childQ = new ArrayDeque<>();
        childQ.add(v);
        while (!childQ.isEmpty()) {
            v = childQ.poll();
            for (int u : graph.adj.get(v)) {
                if (!discovered[u]) {
                    discovered[u] = true;
                    level[u] = level[v] + 1;
                    childQ.add(u);
                } else {
                    if (level[v] == level[u]) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // List of graph edges as per above diagram
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(2, 3), new Edge(2, 8),
                new Edge(3, 4), new Edge(4, 6), new Edge(5, 7),
                new Edge(5, 9), new Edge(8, 9)
                // if we add 2->4 edge, graph is becomes non-Bipartite
        );

        // Set number of vertices in the graph
        final int N = 10;

        // create a graph from edges
        Graph graph = new Graph(edges, N);

        // Do BFS traversal starting from vertex 1
        if(BFS(graph, 1,N))
            System.out.println("Bipartite Graph");
        else
                System.out.println("Not a Bipartite Graph");
    }
}
