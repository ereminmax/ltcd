package com.maxeremin.quora.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
// http://www.techiedelight.com/min-throws-required-to-win-snake-and-ladder-game/
public class SnakeAndLadderGame {
    static class Edge {
        int src, dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static class Node{
        int ver;
        int minDest;
        Node (int ver, int minDest) {
            this.ver = ver;
            this.minDest = minDest;
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
    public static void BFS(Graph graph, int source, int N) {
        Queue<Node> childQ = new ArrayDeque<>();
        boolean[] discovered = new boolean[N + 1];
        Node node = new Node(source, 0);
        childQ.add(node);
        while(!childQ.isEmpty()){
            Node currentNode = childQ.poll();
            if (currentNode.ver == N){
                System.out.println(currentNode.minDest);
                break;
            }

            for(int u: graph.adj.get(currentNode.ver)){
                if(!discovered[u]){
                    discovered[u]= true;
                    Node n = new Node(u, currentNode.minDest + 1);
                    childQ.add(n);
                }
            }
        }

    }
}
