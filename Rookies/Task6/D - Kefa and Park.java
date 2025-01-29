
package com.company.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class problemD {
    static ArrayList<Integer>[] tree; 
    static int maxcats;  
    static boolean[] visited;
    static int path = 0; 
    static boolean[] cat;    
    

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 
        maxcats = input.nextInt(); 
        cat = new boolean[n];
        visited = new boolean[n];
        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            cat[i] = input.nextInt() == 1;
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = input.nextInt() - 1;
            int v = input.nextInt() - 1;
            tree[u].add(v);
            tree[v].add(u);
        }
        DFS(0, 0);
        System.out.println(path);
    }

    
    static void DFS(int node, int nextcats) {
      
        if (cat[node]) {
            nextcats++;
        } else {
            nextcats = 0;
        }
        if (nextcats > maxcats){
            return;
        }
        visited[node] = true; 
         boolean isLeaf = true; 
        for (int neighbor : tree[node]) {
            if (!visited[neighbor]) {
                DFS(neighbor, nextcats);
                isLeaf = false; 
            }
        }
        if (isLeaf){
           path++;
        }
    }
}
