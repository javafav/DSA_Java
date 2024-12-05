package src.patterns;

import java.util.Scanner;

public class TrianglePattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
