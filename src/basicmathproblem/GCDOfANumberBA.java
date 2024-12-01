package src.basicmathproblem;

public class GCDOfANumberBA {
    public static void main(String[] args) {
        int n1 = 20, n2 = 40;
//Here in class name BA mean Better  Approach
        // Find the GCD of n1 and n2
        //Brute Force Approach
        int gcd = gcdFinder(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
    static int gcdFinder(int num1, int num2){
        int min = num1 < num2 ? num1 : num2;
        int count = 0;
        for(int i = min; i > 0; i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("Step: "+ count);
                count++;
                return  i;

            }
        }
        return 1;
    }

}
