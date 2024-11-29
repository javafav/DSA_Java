package src;

import java.util.EnumSet;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number");
        int number = scanner.nextInt();
        System.out.println(   numberCount(number) );

    }
    static int numberCount(int number){
        int numCount = 0;
        if(number > 0 && number < 10){
            numCount = 1;
            return  numCount;
        }

        while (number >= 10){
            number = number / 10;
            numCount++;
        }
        numCount += 1;
        return numCount;
    }
}
