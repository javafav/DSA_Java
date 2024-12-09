package src.recursion.simple;

import java.util.Arrays;

public class ReverseArrayWithRecursionTwoVariable {
    public static void main(String[] args) {
        // Initialize an array to be reversed
        int[] n = {4, 2, 6, 7};

        // Call the recursive method to reverse the array
        reverseArray(n, 0, n.length - 1);

        // Print the reversed array
        System.out.println(Arrays.toString(n));
    }

    /**
     * Recursively reverses an array in place.
     *
     * @param number The array to reverse
     * @param left The index of the left pointer
     * @param right The index of the right pointer
     */

    static void reverseArray(int[] number, int left, int right) {
        // Base condition: Stop recursion if the left pointer crosses the right pointer
        if (right < left) {
            return;
        }

        // Swap the elements at the left and right pointers
        int temp = number[left];
        number[left] = number[right];
        number[right] = temp;

        // Recursively call the method, moving the left pointer forward and the right pointer backward
        reverseArray(number, left + 1, right - 1);
    }
}
