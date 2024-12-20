package com.company.task5;


import java.util.Scanner;
public class problemA {
    static long [] w ;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        w = new long[n];
        for(int i = 0; i <n; i ++){
            w[i] = input.nextInt();
        }
       
        long min = grouping(0,0,0);
        System.out.print(min);
    }
    static long grouping (long A, long B,int i ){
        if(i == w.length){
           return Math.abs( A - B);
       }else{
       return Math.min(
          grouping( (A + w[i]), B, i+1),
          grouping(A , (w[i]+ B), i+1)     
       );
    }
    }
}
