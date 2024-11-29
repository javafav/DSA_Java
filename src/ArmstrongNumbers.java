package src;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter second number");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {

        }


    }

    static boolean armstrongNumbers(int number) {
        if (number > 100000) {
            return false;
        }
        int firstDigit = number % 10;
        int firstDigitReminder = number / 10;
        int secondDigit = number % 10;
        int secondDigitReminder = number / 10;
        int thirdDigit = number % 10;

      //  int secondDigitReminder = number / 10;
return true;

    }

}
