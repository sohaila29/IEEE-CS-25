
package com.company.ieee_rookies;
import java.util.Scanner;

public class problem_D {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String symbols = input.next();
        int[] coordinates  = new int[n];
        int minMoment = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            coordinates [i] = input.nextInt();
            if (coordinates[i] % 2 != 0) {
                return; 
            }
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (symbols.charAt(i) == 'R' && symbols.charAt(i + 1) == 'L') {
                int time = (coordinates[i + 1] - coordinates[i]) / 2;
                minMoment = Math.min(minMoment, time);
            }
        }
        
        if(minMoment == Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
        System.out.println(minMoment);
        }
    }
}
