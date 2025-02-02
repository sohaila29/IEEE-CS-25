
package com.company.cs_25_rookies_contest;

import java.util.Scanner;

public class problemJ {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); 
        int []nice ={6,9,66,69,96,99};
        
        for(int i = 0; i <t; i++){
           int n = input.nextInt();
            boolean isNice = false;
           for(int j = 0; j <6; j++){
               if(n==nice[j]){
                   System.out.println(n);
                   isNice = true;
                    break;
               }
           }
           if(!isNice){
               for(int j = 0; j <6; j++){
               if(n<nice[j]){
                   System.out.println(nice[j]);
                    break;
               }
           }
           
        }
    }
}}
