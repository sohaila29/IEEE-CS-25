
package com.company.ieee_rookies;
import java.util.Scanner;
public class problem_A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int [n];
        int maxIndex = 0;
        int minIndex = 0;
        int moves ;
         
        for(int i = 0; i<n; i++){
           a[i] = input.nextInt();
        }
        
        for(int i = 0; i<n; i++){
            if(a[i] > a[maxIndex]){
                maxIndex = i;
            }
            if(a[i]<= a[minIndex]){
                minIndex = i;
            }
        }
        
       if( maxIndex > minIndex){
           moves = maxIndex + (a.length - minIndex - 2);
       }else{
           moves = maxIndex +(a.length - 1 - minIndex);
       }
       
        
        
        System.out.println(moves);
        
    }
}
