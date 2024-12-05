
package com.company.rookies;
import java.util.Scanner;
public class problemD {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long t = input.nextLong();
        long[] minutes  = new long[n];
        for (int i = 0; i < n; i++) {
            minutes [i] = input.nextLong();
        }
        
        long sum = 0;
        int canRead = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += minutes [i];
            while (sum > t) {
                sum -= minutes [start];
                start++; 
            }
            canRead = Math.max(canRead, i - start + 1);
            
        }  System.out.println(canRead);   
    
    }
}
