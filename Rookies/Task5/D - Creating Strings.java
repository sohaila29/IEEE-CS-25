
package com.company.task5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class problemD {
        static HashSet<String> uniqueOrders = new HashSet<>();    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String chars = input.next();
        newOrders(chars.toCharArray(), 0);
        ArrayList<String> sortedOrders = new ArrayList<>(uniqueOrders);
        Collections.sort(sortedOrders);
        
        System.out.println(sortedOrders.size());
        for (String s : sortedOrders) {
            System.out.println(s);
        }
        
    }
    static void swapChar(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    static void newOrders(char[] s, int i) {
        if (i == s.length) {
            uniqueOrders.add(new String(s)); 
            return;
        }
        for (int j = i; j < s.length; j++) {
            swapChar(s, i, j);
            newOrders(s, i + 1);
            swapChar(s, i, j); 
        }
    }
}
