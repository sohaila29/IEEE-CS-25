
package com.company.cs_25_rookies_contest;

import java.util.Scanner;

public class problemF {

    public static void main(String args[]) {
          Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int q = input.nextInt();

            int[] a = new int[k + 1];
            a[0] = 0;
            for (int j = 1; j <= k; j++) {
                a[j] = input.nextInt();
            }
            int[] b = new int[k + 1];
            b[0] = 0;
            for (int j = 1; j <= k; j++) {
                b[j] = input.nextInt();
            }
            while (q-- > 0) {
                int d = input.nextInt();
                System.out.print(Search(a, b, d) + " ");
            }
            System.out.println();
        }
   }

    public static int Search(int[] a, int[] b, int d) {
        int left = 0, right = a.length - 1;
        if (d == 0) {
            return 0;
        }
        while (left < right) {
            int mid = (left + right +1)/ 2;
            if (a[mid] <=d) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        
        if (a[left] == d) {
            return b[left];
        }
        if (left == a.length - 1) {
            return b[left];
        }

        long v1 = b[left + 1] - b[left];
        long v2 = a[left + 1] - a[left];
        long result = b[left] + (v1 * (d - a[left])) / v2;
        return (int) result;
    }
}