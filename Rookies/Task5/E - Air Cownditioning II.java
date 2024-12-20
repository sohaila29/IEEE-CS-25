
package com.company.task5;

import java.util.Scanner;
public class problemE {
    static int n, m;
    static int[][] cows;
    static int[][] airCond;
    static int minMoney = Integer.MAX_VALUE;
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        cows = new int[n][3];
        airCond = new int[m][4];
        for(int j=0; j<n; j++){
            for(int i = 0; i<3; i ++){
                cows[j][i] = input.nextInt();
            }
        }
        for(int j=0; j<m; j++){
            for(int i = 0; i<4; i ++){
                airCond[j][i] = input.nextInt();
            }
        }
        int [] cooling = new int[101];
        conditioners(cooling, 0,0);
        System.out.println(minMoney);
    }
    private static void conditioners ( int[] cooling, int i, int cost) {
        if(i == m){
            if(isComfortable(cooling)){
                minMoney= Math.min(minMoney, cost);
            }return;
        }
        conditioners(cooling, i+1, cost );
        int[] updated=cooling.clone();
        for (int j = airCond[i][0]; j <= airCond[i][1]; j++) {
            updated[j] += airCond[i][2];
        }

       conditioners(updated, i+ 1,  cost + airCond[i][3]);
    
         
    }
    private static boolean isComfortable(int[] cooling) {
        for (int[] c : cows) {
            for (int i = c[0]; i <= c[1]; i++) {
                if (cooling[i] < c[2]) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
