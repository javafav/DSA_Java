package src.basicmathproblem;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenesPractiseBFA {

    //Here in class name * BFA * mean Brute Force Approach

    public static void main(String[] args) {
        printPrimeNumbers(251);
    }

    static void printPrimeNumbers(int number) {
 //        for(int i=2; i <= number; i++){  // Assuming all the number are the prime number in the range of number that is provided
//                primeFactors[i] = 0;   //It doesn't need because array initialize 0 at java by default.

//        }

        int[] primeNumbers = new int[number + 1];
        for (int i = 2; i <= number; i++) {
            if (primeNumbers[i] == 0) {
                for (int j = 2 * i; j <= number; j += i) {
                    primeNumbers[j] = 1;
                }
            }
        }

        for (int i = 2; i <= number; i++) {
            if (primeNumbers[i] == 0) {
                System.out.println(i + " is prime.");
            }
        }
    }

    public static class PrintAlDivisors {
        public static void main(String[] args) {
    allDivisors(36);
        }
        static List<Integer> allDivisors(int number){
            List<Integer> allDivisor = new ArrayList<>();
            for(int i = 1; i * i <= number ; i++){ // replacement of  Math.sqrt(number)
                if(number % i == 0){
                    allDivisor.add(i);
                    if((number / i) != i ){
                        allDivisor.add( number / i);
                    }
                }
            }
            allDivisor.sort(Integer::compareTo);
            System.out.println(allDivisor);
            return allDivisor;
        }
    }
}
