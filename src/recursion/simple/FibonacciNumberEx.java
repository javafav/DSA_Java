package src.recursion.simple;

import java.util.Scanner;

public class FibonacciNumberEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the number you want fibonacci number : ");
        int number = scanner.nextInt();
        System.out.println(  fibonacciNumber(number) );
    }
    static int fibonacciNumber(int number){
      if(number <= 1){
          return number;
      }
      return fibonacciNumber(number -1 ) + fibonacciNumber(number -2);


    }

}
