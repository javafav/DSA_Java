package src;

import java.util.Scanner;

public class SimpleCalculator {
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double result = Double.MIN_VALUE;
        double num1 = scanner.nextDouble();

        System.out.println("Please enter  operand [ + - x /]");
        String opereator = scanner.next();

        System.out.print("Please enter  second number: ");
        double num2 = scanner.nextDouble();
        if (opereator.equals("+")) {
            result = num1 + num2;
            System.out.println("Addation of  " + num1 + " + " + num2 + " =  " + result);
        } else if (opereator.equals("-")) {
            result = num1 - num2;
            System.out.println("Subtraction of  " + num1 + " - " + num2 + " =  " + result);
        } else if (opereator.equals("-")) {
            result = num1 * num2;
            System.out.println("Multiplication of  " + num1 + " * " + num2 + " =  " + result);
        }else if (opereator.equals("/")) {
            result = num1 / num2;
           if(num2 == 0){
            scanner.close();
            throw new IllegalArgumentException("Division by zero");
           }
            System.out.println("Divsion of  " + num1 + " / " + num2 + " =  " + result);
        }else{
            System.out.println("Unknown Operator " + opereator);
        }
        scanner.close();
    }

}
