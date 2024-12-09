package src.recursion.simple;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "hello";

        boolean isPalindrome = palindromeString(str.toCharArray(), 0);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome);

        isPalindrome = palindromeString(str1.toCharArray(), 0);
        System.out.println("Is the string \"" + str1 + "\" a palindrome? " + isPalindrome);
    }

    static boolean palindromeString(char[] s, int pointer) {
        // Base case: If the pointer reaches the middle of the string, it's a palindrome
        if (pointer >= (s.length / 2)) {
            return true;
        }

        // Check if characters at pointer and its mirror index are not the same
        if (s[pointer] != s[s.length - pointer - 1]) {
            return false; // If mismatch, it's not a palindrome
        }

        // Recursively check the next characters
        return palindromeString(s, pointer + 1);
    }
}
