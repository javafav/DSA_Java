package src.patterns;

import java.util.Scanner;
/*
Input Format: N = 3
Result:
***
* *
***
 char isStarOrSpace = (i == 1 || i == n || j==1 || j== n ) ? '*' : ' ';
Input Format: N = 6
Result:
******
*    *
*    *
*    *
*    *
******
*/
public class SequarePatternOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) { // outer loop for rows

           for(int j =1; j<=n; j++){
               char isStarOrSpace = (i == 1 || i == n || j==1 || j== n ) ? '*' : ' ';
               System.out.print(isStarOrSpace);
           }

           System.out.println();
        }
    }
}
