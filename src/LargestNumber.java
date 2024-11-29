package src;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Please enter secondNumber number: ");
        int secondNumber = scanner.nextInt();

        int largestNumber = firstNumber > secondNumber ? firstNumber : secondNumber;

        System.out.println("The Largest number between " + firstNumber +  " and " + secondNumber +
                           " is :" + largestNumber);
    }
}
