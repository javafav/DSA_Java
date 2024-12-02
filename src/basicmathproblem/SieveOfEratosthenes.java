package src.basicmathproblem;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
isPrime(25);
    }
    static void isPrime(int number){
        int[] primeFactors = new int[number + 1];

//        for(int i=2; i <= number; i++){
//            primeFactors[i] = 0;   //It doesn't need because array initialize 0 at java by default.
//
//        }
        for(int i=2; i <= number; i++){
            if(primeFactors[i] == 0){
                for(int j = 2 * i; j<= number; j+=i){
                    primeFactors[j] = 1;
                    //System.out.println(primeFactors[j]);
                }
            }
        }
        for (int i = 2; i <= number; i++) {
            if (primeFactors[i] == 0) {
                System.out.println(i + " is prime.");
            }
        }

    }
}
