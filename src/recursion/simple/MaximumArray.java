package src.recursion.simple;

public class MaximumArray {
    public static void main(String[] args) {
        //input Array
        int[] x = { 11,13,4,5,6};
       int len = x.length;
        System.out.println(printMax(x, len) );

    }
     static int printMax(int[] numbers, int len){
        if(len == 1){
            return numbers[0];
        }
       return Math.max(numbers[len - 1] , printMax(numbers, len - 1));
     }


}
