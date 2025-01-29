package com.company.task6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problemC {
        static class Edge {
        int node, cost;
        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Edge>[] graph = new List[n];
        for (int i = 0; i< n;i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            int c = input.nextInt();
            graph[u].add(new Edge(v, c));
            graph[v].add(new Edge(u, c));
        }
        System.out.println(DFS(graph,0, -1));
    }


    public static int DFS(List<Edge>[] graph,int node, int parent) {
        int maxCost1 = 0;
        int maxCost2 = 0;

        for (Edge edge : graph[node]) {
            if (edge.node != parent) {
                int cost = DFS(graph,edge.node, node) + edge.cost;

                if (cost > maxCost1) {
                    maxCost2 = maxCost1;
                    maxCost1 = cost;
                } else if (cost > maxCost2) {
                    maxCost2 = cost;
                }
            }
        }return maxCost1;
    }
    }

