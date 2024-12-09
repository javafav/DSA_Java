package src.recursion.simple;

import java.util.Scanner;

public class SumOfNNumberAnotherWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the number you want sum: ");
        int number = scanner.nextInt();
        System.out.println(  sumOfNNumber(number) );
    }

    static int sumOfNNumber(int number){

        if(number == 1){
            return 1 ;
        }
         return number + sumOfNNumber(number - 1);




    }
}
