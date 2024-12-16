package src.recursion.simple;

import java.util.Arrays;

public class SumTriangleEx {
    public static void main(String[] args) {
        //input Array
        int[] numbers = { 1, 2,4,5 };
        //Recursive function that will print answer
        printSumTriangle(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void printSumTriangle(int[] numbers) {
        if(numbers.length  == 1){
            return;
        }

        int[] temp = new int[numbers.length - 1];
        helper(numbers, temp, 0);
        printSumTriangle(temp);
        System.out.println(Arrays.toString(temp));


    }
    static int[] helper(int[] numbers, int[] temp, int index){
       //base case if reach to the last element of number[] then return the temp[]
        if(index == numbers.length - 1){
            return temp;
        }
        // temp[index] =  sum of consecutive number of number[index] + number[index + 1]
         temp[index] = numbers[index] + numbers[index + 1];
       return helper(numbers, temp, index + 1);
    }
}
