package src.basicmathproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestPrimeFactorOfNumber {
    static final int MAX = 1000000;
    static int[] spf = new int[MAX + 1];


    public static void main(String[] args) {
        computeSPF(); // Precompute SPF for all numbers up to MAX

        // Test prime factorization for a number
        int number = 780;
        List<Integer> factors = primeFactorization(number);

        System.out.println("Prime factors of " + number + " are: " + factors);
    }


    static void computeSPF() {

        for (int i = 0; i <= MAX; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

    }

    static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n != 1){
            factors.add(spf[n]);
            n = n / spf[n];
        }
        return factors;
    }

    public static class SimpleCalculator {


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
            } else if (opereator.equals("*")) {
                result = num1 * num2;
                System.out.println("Multiplication of  " + num1 + " * " + num2 + " =  " + result);
            }else if (opereator.equals("/")) {
                result = num1 / num2;
               if(num2 == 0){
                scanner.close();
                throw new IllegalArgumentException("Division by zero");
               }
                System.out.println("Division of  " + num1 + " / " + num2 + " =  " + result);
            }else{
                System.out.println("Unknown Operator " + opereator);
            }
            scanner.close();
        }

    }
}


