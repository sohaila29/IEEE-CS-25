
package com.company.cs_25_rookies_contest;

import java.util.Scanner;

public class problemG {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
       
        for(int i = 0; i<t; i++){
            int n = input.nextInt();
            int k = input.nextInt();
            int q = input.nextInt();
            int[]a= new int[n];
            for(int j = 0; j<n; j++){
               a[j]=input.nextInt();
            }
            
            int days=0;
            long f=0;
            for(int x = 0; x<n; x++){
                if(a[x] <=q){
                    days++;
                }else {
                    if(days >= k){
                  f+=  calculateWays(days,k);
                }
                days=0;
            }

        }
        if(days >=k){
            f +=calculateWays(days,k);
        }System.out.println(f);
    }}
     private static long calculateWays(int days, int k) {
        long count = (long) (days - k + 1) * (days - k + 2) / 2;
        return count;
    }
}
