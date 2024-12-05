package src.patterns;

import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {

        for (int i = 0; i < n; i++) {// outer loop for rows
            int start = 1;
        if(i % 2 != 0) start = 0;
        for(int j = 0; j<=i; j++){
            System.out.print(start + " ");
            start = 1 -start;
        }
            System.out.println();

        }
    }
}
