package src.patterns;

import java.util.Scanner;

public class AlphabetPatternTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {

            //space
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            char alphabet = 'A';

            //letter

            for (int j = 1; j <= 2 *i +1; j++) {
                System.out.print(alphabet);

            }

            //space
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
