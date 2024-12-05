package src.patterns;

import java.util.Scanner;

public class AlphabetPatternReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {

        for(int i=1; i<= n; i++){
            char alphabet = 'A';
          for(int j =n; j>=i; j--){
              System.out.print(alphabet + " ");
              alphabet++;
          }
            System.out.println();
        }
    }
}
