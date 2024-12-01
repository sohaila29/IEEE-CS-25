
package com.company.ieee_rookies;
import java.util.Scanner;
public class problem_C {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isAlmostLucky = false;
        
        for (int i = 4; i <= 1000; i++) {
            if (isLucky(i) && n % i == 0 ) {
                isAlmostLucky = true;
                break;
            }
        }
        if(isLucky(n) || isAlmostLucky){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
 public static boolean isLucky(int num) {
        while (num > 0) {
            int digit = num%10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num/= 10;
        }
        return true;
    }
}

