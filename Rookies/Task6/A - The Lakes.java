
package com.company.task6;

import java.util.Scanner;
import java.util.Stack;

public class problemA {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = input.nextInt();
                }
            }
            System.out.println(findLargestVolume(grid, n, m));
        }
    }
    
    
    
    public static long findLargestVolume(int[][] grid, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        long maxVol = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    long volume = DFS(grid, i, j,n, m,visited);
                    maxVol = Math.max(maxVol, volume);
                }
            }
        }return maxVol;
    }

    
    public static long DFS(int[][] grid, int x, int y, int n, int m, boolean[][] visited) {
    Stack<int[]> stack = new Stack<>();
    stack.push(new int[]{x, y});
    long volume = 0;
    while(!stack.isEmpty()) {
        int[] current = stack.pop();
        int cx = current[0], cy = current[1];

        if (cx < 0 || cx >= n ||cy < 0 || cy >= m || grid[cx][cy] ==0 || visited[cx][cy]) {
            continue;
        }
        visited[cx][cy] = true;
        volume += grid[cx][cy];
        for (int i = 0; i < 4; i++) {
            stack.push(new int[]{cx + dx[i], cy + dy[i]});
        }
    }
    return volume;
}
}

