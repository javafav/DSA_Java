package src.csesproblems;

import java.util.Collection;
import java.util.HashMap;

public class RepetitionsOfCharacters {
    public static void main(String[] args) {
        System.out.println(countMaxCharacterOccurrence("ATTCGA"));
    }
    static int countMaxCharacterOccurrence(String dnaSeries){
        HashMap<Character, Integer> countOfOccurrence = new HashMap<>();
       for(char c : dnaSeries.toCharArray()){
           countOfOccurrence.compute(c, (letter, count) -> (count == null) ? 1 : count + 1 );
       }
        Collection<Integer> values = countOfOccurrence.values();
       int maxOccuerce = 1;
       for(int i : values){
        maxOccuerce =   maxOccuerce > i ? maxOccuerce : i;
       }


return maxOccuerce;

    }
}



/*
You are given a DNA sequence: a string consisting of characters A, C, G, and T.
Your task is to find the longest Occurrence in the sequence.


Input:
- The only input line contains a string of n characters.

Output:
- Print one integer: the length of the longest repetition.

Constraints:
1 <= n <= 10^6

Example:
Input:
ATTCGGAG

Output:
3
*/

