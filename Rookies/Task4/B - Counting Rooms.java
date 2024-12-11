
package com.company.rookiesx;

import java.util.Scanner;
import java.util.Stack;

public class problemB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        boolean[][]used = new boolean [n][m];
        int rooms = 0;
        
        for(int i = 0; i < n; i++){
            String row = input.nextLine();
            for(int j = 0; j < m; j++){
                if (row.charAt(j) == '#'){
                    used[i][j] = true;
                }      
            }
        }
        
       rooms = numOfRooms(n, m, used);
        System.out.println(rooms);
    }
    static boolean map(int i, int j, int n, int m, boolean[][] used){
        if( i < 0 || j < 0  || i >= n || j >= m){
            return false;
        }
        return !used[i][j];
    }
    
    static void DFS(int i, int j, int n, int m, boolean[][] used, int[][] visit) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];
            
             if (!used[x][y]) {
                used[x][y] = true;
                for (int[] v : visit) {
                    int nextX = x + v[0];
                    int nextY = y + v[1];
                    if (map(nextX, nextY, n, m, used)) {
                        stack.push(new int[]{nextX, nextY});
                    }
                }
            }
        }
    }
    
    static int numOfRooms(int n, int m, boolean[][] used) {
        int rooms = 0;
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!used[i][j]) { 
                    DFS(i, j, n, m, used, moves); 
                    rooms++; 
                }
            }
        }
        return rooms;
    }
        
    }

