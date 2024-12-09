package src.recursion.simple;

import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the number you want sum: ");
        int number = scanner.nextInt();
        sumOfNNumber(number, 0);
    }

    static void sumOfNNumber(int number, int sum){

        if(number == 0){
            System.out.println(sum);
            return ;
        }
        sumOfNNumber(number - 1,  sum+ number);




    }
}
