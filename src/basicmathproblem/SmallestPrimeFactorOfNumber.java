package src.basicmathproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestPrimeFactorOfNumber {
    static final int MAX = 1000000;
    static int[] spf = new int[MAX + 1];


    public static void main(String[] args) {
        computeSPF(); // Precompute SPF for all numbers up to MAX

        // Test prime factorization for a number
        int number = 780;
        List<Integer> factors = primeFactorization(number);

        System.out.println("Prime factors of " + number + " are: " + factors);
    }


    static void computeSPF() {

        for (int i = 0; i <= MAX; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

    }

    static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n != 1){
            factors.add(spf[n]);
            n = n / spf[n];
        }
        return factors;
    }

}


