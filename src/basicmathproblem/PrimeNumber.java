package src.basicmathproblem;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
    static boolean checkPrime(int number){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                count++;
                if((number / i) != i) count++;
            }

        }if(count == 2){
            return true;
        }else {
            return false;
        }

    }
}
