package src.patterns;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) { // outer loop for rows
            for (int j = 1; j <= n - i + 1; j++) {// inner loop for columns
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
