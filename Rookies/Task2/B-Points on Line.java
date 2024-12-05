
package com.company.rookies;
import java.util.Scanner;
import java.util.Arrays;

public class problemB {

    public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int[] points= new int [n] ;
         for (int i = 0; i < n; i++){
            points [i] =  input.nextInt();
         }
         Arrays.sort(points);
         long numOfGroubs = 0;
         
        for(int i =0; i<n; i++) {
           int lastPoint = binarySearch(points,i, points[i] + d);
           long numOfPoints = lastPoint- i;
           if(numOfPoints >= 2){
                numOfGroubs += numOfPoints * (numOfPoints - 1)/2;
           }
          }System.out.println(numOfGroubs);
        
        
        
    }
    static int binarySearch ( int[]arr,int lowPointer, int d ){
       int low = lowPointer;
       int high = arr.length -1;
       
       while(low <= high){
           int mid = (low +high)/2;
           if(arr[mid]<= d){
               low = mid +1;
           }
           else{
               high= mid -1;
           }
       }
       return low-1;
    
    }
}
