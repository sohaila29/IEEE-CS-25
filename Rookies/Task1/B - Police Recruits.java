
package com.company.ieee_rookies;
import java.util.Scanner;
public class problem_B {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int [n];
        int recruited = 0;
        int untreated = 0;
        
         
        for(int i = 0; i<n; i++){
           a[i] = input.nextInt();
        }
         
        for(int i = 0; i < n; i++){
            if(a[i] == -1){
                if(recruited<=0){
                    untreated++;
                }else{
                    recruited--;
                }
            }else{
                recruited += a[i];
            }
        }    
        
        System.out.println(untreated);
    }
}
