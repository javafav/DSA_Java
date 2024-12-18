package src.csesproblems;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number");
        int number = scanner.nextInt();
        printWeirdAlgorithm(number);
    }

    static void printWeirdAlgorithm(int number) {
        if (number <= 1) {
            System.out.println(number);
            return;
        }

        while (number != 1) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                number /= 2;
            } else {
                System.out.print(number + " ");
                number = (number * 3) + 1;
            }
        }
        System.out.print(number);
    }


}


/*
Time limit: 1.00 s
Memory limit: 512 MB

Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3 → 10 → 5 → 16 → 8 → 4 → 2 → 1

Your task is to simulate the execution of the algorithm for a given value of n.
Input
The only input line contains an integer n.
Output
Print a line that contains all values of n during the algorithm.
Constraints

1 <= n <= 10^6

Example
Input:
3

Output:
3 10 5 16 8 4 2 1
* */