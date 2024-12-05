
package com.company.rookies;
import java.util.Arrays;
import java.util.Scanner;

public class problemC {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[] citiesPos = new int[n];
        for (int i = 0; i < n; i++) {
            citiesPos[i] = input.nextInt();
        }Arrays.sort(citiesPos); 
        
        int[] towersPos = new int[m];
        for (int i = 0; i < m; i++) {
            towersPos[i] = input.nextInt();
        } Arrays.sort(towersPos); 
        
        int r = 0;
         for (int i = 0; i < n; i++) {
            int p = binarySearch(towersPos, citiesPos[i]);
            
            if (p == 0) {
                r = Math.max(r, Math.abs(citiesPos[i] - towersPos[p]));
            } else if (p == m) {
                r = Math.max(r, Math.abs(citiesPos[i] - towersPos[p - 1]));
            } else {
                r = Math.max(r, Math.min(Math.abs(citiesPos[i] - towersPos[p]), Math.abs(citiesPos[i] - towersPos[p - 1])));
            }
        }
        
        System.out.println(r);
    }
     static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        int closestTower = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;  
            }
            if (arr[mid] < value) {
                closestTower = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return closestTower + 1;
    
    }
}
