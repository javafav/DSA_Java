package src.basicmathproblem;

public class GCDOfANumberBFA {
    public static void main(String[] args) {
        int n1 = 20, n2 = 40;
//Here in class name BFA mean Brute Force Approach
        // Find the GCD of n1 and n2
        //Brute Force Approach
        int gcd = gcdFinder(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    static int gcdFinder(int num1, int num2) {
        int gcd = 1;
        int count = 0;
        num2 = num1 < num2 ? num1 : num2;
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {

                count++;
                gcd = i;
            }
        }
        return gcd;
    }
}
