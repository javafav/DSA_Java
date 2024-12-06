package src.patterns;

import java.util.Scanner;

public class AlphabetPatternThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
         char ch = (char) ('A' + n -i);
         for(int j = 1; j<=i; j++){
             System.out.print(ch);
             ch++;
         }
         System.out.println();

        }
    }
}
