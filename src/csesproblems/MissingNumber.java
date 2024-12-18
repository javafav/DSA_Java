package src.csesproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the range (n) to find the missing number: ");
        int N = scanner.nextInt();

        System.out.println("Please enter " + (N - 1) + " numbers between 1 and " + N + ":");
        int[] Numbers = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            Numbers[i] = scanner.nextInt();
        }

        int missing = findMissingNumber(N, Numbers);
        System.out.println("The missing number is: " + missing);
    }

    static int findMissingNumber(int N, int[] Numbers) {

        int expectedSum = 0;
        // sum formula is sum = (n * (n+1) ) / 2; for 1   to n like sum of 1 to 3 = 6
        expectedSum = (N * (N + 1)) / 2;
        int actulSum = 0;
        for (int i : Numbers) {
            actulSum += i;
        }
        return expectedSum - actulSum;
    }
}


/*
You are given all numbers between 1, 2, ..., n except one.
Your task is to find the missing number.

Input:
The first input line contains an integer n.
The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).

Output:
Print the missing number.

Constraints:
2 <= n <= 200000

Example:
Input:
5
2 3 1 5

Output:
4
*/
