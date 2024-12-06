package src.patterns;

import java.util.Scanner;

public class AlphabetPatternOneDifferntWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {

        for(int i=1; i<= n; i++){
            for(char c = 'A'; c<= 'A' + i; c++){
                System.out.print(c + " ");

            }
            System.out.println();

        }
    }
}
