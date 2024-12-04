package src.patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) { // outer loop for rows
            for (int j = 0; j < n; j++) {// inner loop for columns
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
