package src.recursion.simple;

import java.util.Arrays;

public class ReverseArrayWithoutRecursion {
    public static void main(String[] args) {
       //Comments are added by Chatgpt for program readability.
        // Initialize an array to be reversed
        int[] n = {4, 2, 6, 7};

        // Call the method to reverse the array
        reverseArray(n);
    }

    /**
     * Reverses the given array in place without using recursion.
     *
     * @param number The array to reverse
     */
    static void reverseArray(int[] number) {
        // Initialize two pointers: one starting from the left (i = 0) and one from the right (j = number.length - 1)
        for (int i = 0, j = number.length - 1; i < j; i++) {

            // Swap the elements at indices i and j
            int temp = number[i];
            number[i] = number[j];
            number[j] = temp;

            // Move the right pointer one step to the left
            j--;
        }

        // Print the reversed array
        System.out.println(Arrays.toString(number));
    }
}
