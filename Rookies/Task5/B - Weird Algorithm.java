
package com.company.task5;

import java.util.Scanner;
public class problemB {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        algo(n);
    }
    static void algo(long n){
        System.out.print(n + " ");
        
        if (n == 1) return;
        if (n % 2 == 0){
            algo(n/2);
        }else{
            algo(3*n+1);
        }    
    }
}
