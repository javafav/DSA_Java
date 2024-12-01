package src.basicmathproblem;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorOfANumber {
    public static void main(String[] args) {
        System.out.println(getPrimeFactor(780));
    }

    static List<Integer> getPrimeFactor(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                while (number % i == 0) {
                    number /= i;
                }

            }
        }

        if (number > 1 && isPrime(number)) {
            primeFactors.add(number);
        }
        System.out.println(primeFactors);
        return primeFactors;

    }

    static boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
