package src.basicmathproblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeFactorPractised {
    public static void main(String[] args) {
        findPrimeFactor(780);
    }

    static List<Integer> findPrimeFactor(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        List<Integer> frequencyOfNumber = new ArrayList<>();
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                frequencyOfNumber.add(i);
                while (number % i == 0) {
                    number /= i;
                    frequencyOfNumber.add(i);
                }
            }
            if (number > 1 && isPrime(number)) {
                primeFactors.add(number);
                frequencyOfNumber.add(number);
            }

        }
        printPrimeFactor(frequencyOfNumber);
        //   System.out.println(primeFactors);
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

    static void printPrimeFactor(List<Integer> primeFactor) {
        Iterator<Integer> iterator = primeFactor.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" x ");
            }


        }
        System.out.println(primeFactor);
    }
}