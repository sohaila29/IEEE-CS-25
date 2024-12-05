
package com.company.ieee_rookies;
import java.util.Scanner;
public class problemE {

    public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
        char shiftSymbol= input.next().charAt(0);
        String sequence = input.next();
        
        String kLine1 ="qwertyuiop";
        String kLine2 ="asdfghjkl;";
        String kLine3 ="zxcvbnm,./";
        StringBuilder originalMessage = new StringBuilder();
        String keyboard = kLine1 + kLine2 + kLine3;
        
       for (int i = 0; i < sequence.length(); i++) {
            char sequenceChar = sequence.charAt(i);
            int index =keyboard.indexOf(sequenceChar);

            if (shiftSymbol == 'L') {
                originalMessage.append(keyboard.charAt(index + 1));
            } else if (shiftSymbol == 'R') {
                originalMessage.append(keyboard.charAt(index - 1));
            }
        }
       System.out.println(originalMessage.toString());
        }
}

