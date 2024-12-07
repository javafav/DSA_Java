package src.patterns;

import java.util.Scanner;

/*
Input Format: N = 3
Result:
*    *
**  **
******
**  **
*    *


Input Format: N = 6
Result:
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
*/

public class StarPatternOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {
        int spaces = 2 * n -2;
        for (int i = 1; i <= 2*n -1; i++) {
           //star

            int star = i;
            if(i > n ) star = 2*n -i;
            for(int j =1; j<=star; j++){
                System.out.print("*");
            }

            //space
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //star

            for(int j =1; j<=star; j++){
                System.out.print("*");
            }

            if(i < n) spaces -=2;
            else spaces +=2;
            System.out.println();

        }
    }
}