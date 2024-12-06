package src.patterns;

import java.util.Scanner;

/*
Input Format: N = 3
Result:
******
**  **
*    *
*    *
**  **
******

Input Format: N = 6
Result:
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
*/

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {
        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            int initialSpace = 2 * i;

            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 0; j < initialSpace; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half of the pattern
        int initSpace = (2 * n) - 2;
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= initSpace; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            initSpace -= 2;
            System.out.println();
        }
    }
}
