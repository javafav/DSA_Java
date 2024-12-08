package src.recursion.simple;

import java.util.Scanner;

public class PrintNumber1ToNBackTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the number you want print: ");
        int numberOfTimePrint = scanner.nextInt();
        printNumbers(1, numberOfTimePrint);

    }

    static void printNumbers(int start, int end) {
        if (end <= 0) return;
        printNumbers(start , end -1);
        System.out.println(end);



    }
}
