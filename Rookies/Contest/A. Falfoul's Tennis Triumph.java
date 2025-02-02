
package com.company.cs_25_rookies_contest;

import java.util.Scanner;

public class problemA {

    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
        int N = input.nextInt(); 
        int score =0;
        int [] R= new int[N];
        for(int i = 0; i <N; i++){
            R[i] = input.nextInt();
            if(R[i]==1){
                score++;
            }else{
                score--;
            }
        }
        for(int i = 0; i <=R.length-3; i++){
            if(R[i] == 1 && R[i + 1] == 1 && R[i + 2] == 1){
                score++;
            }
        }
       
        System.out.println(score);
       
    }
}
