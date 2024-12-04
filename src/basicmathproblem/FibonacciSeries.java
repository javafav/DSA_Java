package src.basicmathproblem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endOfFibonacciNumber = scanner.nextInt();
        int prevFibonacciNumber = 0;
        int nextFibonacciNumber = 1;
        int fibonacciSeries;
        System.out.print(prevFibonacciNumber + " ");
        for (int i = 0; i < endOfFibonacciNumber; i++) {
            fibonacciSeries = nextFibonacciNumber + prevFibonacciNumber;
            System.out.print(fibonacciSeries + " ");
            prevFibonacciNumber = nextFibonacciNumber;
            nextFibonacciNumber = fibonacciSeries;

        }
    }
}
