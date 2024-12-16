package src.recursion.simple;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        //input Array
        int[] x = { 1, 2,3,4,5,6};
        //Recursive function that will print answer
        printSumTriangle(x);
        System.out.println(Arrays.toString(x));
    }
    static void printSumTriangle(int[] numbers){

        if(numbers.length == 1){
           return;
        }
        int[] temp = new int[numbers.length - 1];

        helper(numbers, temp, 0);
        printSumTriangle(temp);

        //prints String format of temp Array//
        System.out.println(Arrays.toString(temp));

    }
    static int[] helper(int[] numbers, int[] temp, int index){
        if(index == numbers.length - 1){
            return temp;
        }
        temp[index] = numbers[index] + numbers[index + 1];
        return helper(numbers, temp, index + 1);
    }
}
