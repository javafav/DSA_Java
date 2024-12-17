package src.basicmathproblem;

import java.util.HashMap;

public class LetterCountProduct {
    public static void main(String[] args) {
        System.out.println(letterCountProduct("aaccddddh  "));
    }
    static int letterCountProduct(String word){
        HashMap<Character, Integer> wordCount = new HashMap<>();
        for(char c: word.toCharArray()){
            wordCount.compute(c, (ch, count) -> count == null ? 1: count + 1);
        }
   int prod = 1;
        for(int i : wordCount.values()){
            prod *= i;
        }
   return prod;
    }
}
