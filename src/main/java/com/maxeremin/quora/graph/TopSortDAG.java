package com.maxeremin.quora.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// http://www.techiedelight.com/topological-sorting-dag/
public class TopSortDAG {
    static class Edge{
        int src, dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static class Graph{
        List<List<Integer>> adj = null;
        Graph(List<Edge> edges, int N) {
            adj = new ArrayList<>();
            for (int i = 0; i < N; i++)
                adj.add(new ArrayList<>());
            for (Edge edge: edges)
                adj.get(edge.src).add(edge.dest);
        }
    }

    public static int DFS(Graph graph, int source, boolean[] discovered, int[] departure, int time) {
        discovered[source] = true;
        time++;
        for (int currentChild: graph.adj.get(source)){
            if (!discovered[currentChild]){
                time = DFS(graph, currentChild, discovered, departure, time);
            }
        }
        time++;
        departure[time] = source;
        return time;
    }

    public static void sort(Graph g, int N) {
        int[] departure = new int[2 * N];
        Arrays.fill(departure, -1);
        boolean[] discovered = new boolean[N];
        int time = 0;
        for (int i = 0; i < N; i++) {
            if (!discovered[i]){
                time = DFS(g, i, discovered, departure, time);
            }
        }
        for (int i = N * 2 - 1; i >= 0; i--)
            System.out.println(departure[i]);
    }
}
