
package com.company.rookies;
import java.util.Scanner;
import java.util.Arrays;

public class problemA {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         
         int[]price_arr = new int [n] ;
         for (int i = 0; i < n; i++){
            price_arr [i] =  input.nextInt();
         }
          Arrays.sort(price_arr);
         int q =  input.nextInt();
         int[]spentCoins = new int [q] ;
         for (int j = 0; j < q; j++){
            spentCoins [j] =  input.nextInt();
         }
          for(int i =0; i<q; i++) {
              int canSpend= spentCoins[i];
              int canBuy = binarySearch(price_arr, canSpend);
              System.out.println(canBuy);
          }
         
    }
     static int binarySearch ( int[]arr, int value){
       int low = 0;
       int high = arr.length -1;
       while(low <= high){
           int mid = (low +high)/2;
           if(arr[mid] <= value){
               low = mid +1;
           }
           else{
               high= mid -1;
           }
       }
       return low;
    
    }
}
