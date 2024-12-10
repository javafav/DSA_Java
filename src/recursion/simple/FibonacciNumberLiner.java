package src.recursion.simple;

import java.util.Scanner;

public class FibonacciNumberLiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the number you want fibonacci number : ");
        int number = scanner.nextInt();
        System.out.println(  fibonacciNumber(number) );
    }
    static int fibonacciNumber(int number){
        if(number == 1) return 0;
        if(number == 2) return 1;

        int firstFibonacciNumber = 0, secondFibonacciNumber = 1;

        for(int i =2; i< number; i++){
          int  nextFibonacciNumber =  firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonacciNumber;

        }
        return secondFibonacciNumber ;
    }

}
