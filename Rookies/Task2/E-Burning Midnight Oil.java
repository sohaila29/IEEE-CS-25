
package com.company.rookies;
import java.util.Scanner;
public class problemE {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int l = 1; 
        int r = (int) 1e9 + 7; 
        int maxValue = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (fallsAsleep(n, k, mid)) {
                maxValue = mid; 
                r = mid - 1; 
            } else {
                l = mid + 1; 
            }
        }
        System.out.println(maxValue);
    }
    static boolean fallsAsleep(int n, int k, int mid) {
        int power = 1;
        long sum = 0; 
        int i = 0;
        
        while (mid /power >0) {
            sum += mid /power;
            if (sum >= n)
                return true; 
            power *=k; 
        }
        return sum >= n;
    
    }
}
