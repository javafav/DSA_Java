package src.csesproblems;

public class RepetitionsOfCharactersVariant {
    public static void main(String[] args) {
        System.out.println(countMaxCharacterOccurrence("ATTTCGA"));
    }

    static int countMaxCharacterOccurrence(String dnaSeries) {
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < dnaSeries.length(); i++) {
            if (dnaSeries.charAt(i) == dnaSeries.charAt(i - 1)) {
                currentCount++;

            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        return maxCount;
    }
}




/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T.
Your task is to find the longest repetition in the sequence.
This is a maximum-length substring containing only one type of character.

Input:
- The only input line contains a string of n characters.

Output:
- Print one integer: the length of the longest repetition.

Constraints:
1 <= n <= 10^6

Example:
Input:
ATTCGGGA

Output:
3
*/



