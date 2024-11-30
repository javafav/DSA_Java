package src.basicmathproblem;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter second number");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {

            if(armstrongNumbers(i)){
                System.out.println(i);
            }
        }




    }

    static boolean armstrongNumbers(int number) {

        double sum = 0;
        int countNumber = (int) Math.log10(number) + 1;
       int tempNumber = number;
        while (number > 0){
           int lastDigitOfNumber = number % 10;
            sum = sum +( Math.pow(lastDigitOfNumber, countNumber) );
            number = number / 10;
        }

        if(tempNumber == sum){
            return true;
        }

    //    System.out.println("number " + number +  " sum " + sum);
        return false;


    }

}
