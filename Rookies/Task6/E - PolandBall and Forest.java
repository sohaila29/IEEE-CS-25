
package com.company.task6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problemE {
    static List<Integer>[] trees;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = input.nextInt();
        }
        
        trees = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i =0; i < n; i++) {
            trees[i] = new ArrayList<>();
        }
        for (int i =0; i <n; i++) {
            if (i != p[i]) {
                trees[i].add(p[i]);
                trees[p[i]].add(i);
            }
        }
        int treeCount = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                treeCount++;
                DFS(i);
            }
        }
        System.out.println(treeCount);
    }
    static void DFS(int node) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int next : trees[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    stack.push(next);
                }
           }
        }
}
}
