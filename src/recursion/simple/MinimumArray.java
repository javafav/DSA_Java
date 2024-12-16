package src.recursion.simple;

public class MinimumArray {
    public static void main(String[] args) {
        //input Array
        int[] x = { 11,13,4,5,6};
       int len = x.length;
        System.out.println(printMin(x, len) );

    }
     static int printMin(int[] numbers, int len){
        if(len == 1){
            return numbers[0];
        }
       return Math.min(numbers[len - 1] , printMin(numbers, len - 1));
     }


}
