
package com.company.ieee;
import java.util.Arrays;
import java.util.Scanner;
public class problemA {

    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
        int t = input.nextInt();
       
        for(int i = 0; i < t; i++){
            int n = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();
            int[] a = new int[n] ;
            for(int j = 0; j < n; j++){
                a[j] = input.nextInt();
            }Arrays.sort(a);
            long pairsNum = 0;
            for(int k =0; k<n; k++){
                int left = binarySearchL(a, l - a[k], k + 1, n - 1);
                int right = binarySearchR(a, r - a[k], k + 1, n - 1);
                if (left <= right) {
                    pairsNum += (right - left + 1);
                }
            }
            
            System.out.println(pairsNum);
            
        }
    }
    
    static int binarySearchL(int[] a, int value, int low, int high) {
        int left = high + 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= value) {
                left = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return left;
    }
    
    static int binarySearchR(int[] a, int value, int low, int high) {
        int right = low - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] <= value) {
                right = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return right;
    }
}
