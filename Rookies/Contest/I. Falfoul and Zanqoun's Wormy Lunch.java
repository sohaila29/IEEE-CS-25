
package com.company.cs_25_rookies_contest;

import java.util.Scanner;

public class problemi {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int[n];
        int [] groups = new int [n];
        
        a[0] = input.nextInt();
        groups[0] = a[0];
        for(int i = 1; i <n; i++){
            a[i]= input.nextInt();
            groups[i] = groups[i-1] + a[i];
        }
        
        int m = input.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < m; i++){
            int q= input.nextInt();
           int pile = BinarySearch(q, groups);
        
            result.append(pile).append("\n");
        }
     System.out.print(result);
    }
    public static int BinarySearch(int q, int[] groups) {
        int left = 0, right = groups.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
             if (groups[mid] >= q){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left + 1;    
    }}
