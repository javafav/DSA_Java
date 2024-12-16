package src.basicmathproblem;

import java.util.Scanner;

public class EvenOddProgramWithoutModuleOperator {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        if((num & 1 )  == 0) {
            System.out.println("Even Number: " + num);

    }else{
        System.out.println("Odd Number: " + num);
    }
scanner.close();
}

}
