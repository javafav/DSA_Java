package src.recursion.simple;

import java.util.Scanner;

public class PrintNameNTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = scanner.next();
        System.out.print("Please Enter the number of times you want to print: ");
        int numberOfTimePrint = scanner.nextInt();
        printNameNTime(name, numberOfTimePrint);


    }
    static void printNameNTime(String name, int numberOfTimePrint){

      if(numberOfTimePrint == 0) return;
        System.out.println(numberOfTimePrint + ") " + name);
        numberOfTimePrint--;
        printNameNTime(name, numberOfTimePrint);

    }
}
