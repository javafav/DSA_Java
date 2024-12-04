package src.basicmathproblem;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberCount {

    public static void main(String[] args) {
        int n = 10; // Max range for precomputation
        int[] primePrefix = precomputePrimes(n);

        // Queries
      //  System.out.println(countPrimesInRange( primePrefix,11, 20)); // Output: 4
        //System.out.println(countPrimesInRange(primePrefix, 1, 50));  // Output: 15
    }



    static int[] precomputePrimes(int n) {
        int[] factors = new int[n + 1];
        int[] primePrefix = new int[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (factors[i] == 0) {
                for (int j = i * i; j <= n; j += i){
                  factors[j] = 1;
                }
            }
        }

        for(int i =2; i <= n; i++){

            primePrefix[i] = primePrefix[i - 1] + (factors[i] == 0 ? 1 : 0);
            System.out.print(i + " ");
            // primePrefix[i] = primePrefix[i - 1] + (factors[i] == 0 ? 1 : 0);
        }
        System.out.println();
        System.out.println(Arrays.toString(factors));
//        System.out.println(Arrays.toString(primePrefix));
        return primePrefix;

    }

    static int countPrimesInRange(int[] primePrefix, int a, int b) {
        return primePrefix[b] - primePrefix[a - 1];
    }

    public static class PkrToUsd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter currency in Pkr: ");
            int pkr = scanner.nextInt();

            double pkrToUsd = pkr * 0.0036;
            System.out.println("Pkr "+ pkr + " = " + pkrToUsd + " Usd");

        }
    }
}
