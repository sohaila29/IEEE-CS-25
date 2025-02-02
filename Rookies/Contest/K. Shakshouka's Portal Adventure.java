
package com.company.cs_25_rookies_contest;

import java.util.Scanner;

public class problemK {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int[]arr = new int[n-1];
        for(int i=0; i< arr.length; i++){
            arr[i]=input.nextInt();
        }
        int cc =1;
        while(cc <t){
            cc += arr[cc-1];
        }
        if(cc == t){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }}
