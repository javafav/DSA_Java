package src.recursion.simple;

import java.util.Arrays;

public class ReverseArrayWithRecursionOneVariable {
    public static void main(String[] args) {
        int[] n = {4, 2, 6,7};
       reverseArray(n, 0);
        System.out.println(Arrays.toString(n));
    }

    static void reverseArray(int[] number, int pointer) {
        // Base case: stop recursion when the pointer reaches the middle
        if (pointer >= number.length / 2) {
            return;
        }
        // Swap current element with its counterpart from the end
        int temp = number[pointer];
        number[pointer] = number[number.length - pointer - 1];
        number[number.length - pointer - 1] = temp;

        // Recursive call: move the pointer closer to the middle
        reverseArray(number, pointer + 1);
    }

}
