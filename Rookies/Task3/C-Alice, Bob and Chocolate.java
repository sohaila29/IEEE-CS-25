
package com.company.ieee;
import java.util.Scanner;

public class problemC {

    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []time = new int [n];
        int leftPointer = 0;
        int rightPointer = n - 1;
        int barsA = 0;
        int barsB = 0;
        for(int j = 0; j < n; j++){
            time[j] = input.nextInt();
        }
        
        int time_A = 0;
        int time_B = 0;
        while(rightPointer >= leftPointer){
            if(time_B >= time_A){
                barsA++;
                time_A += time[leftPointer];
                leftPointer++;
            }else{
                barsB++;
                time_B += time[rightPointer];
                rightPointer--;
            }
        }
        System.out.println(barsA +" "+ barsB);
        
    }
}
