package src.patterns;

import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {// outer loop for rows

            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            //space
            for (int s = 1; s < 2 * n - 2 * i; s++) {
                System.out.print(" ");
            }


            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();

        }
    }
}
