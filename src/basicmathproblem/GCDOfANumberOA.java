package src.basicmathproblem;

public class GCDOfANumberOA {
    public static void main(String[] args) {
        int n1 = 10, n2 = 52;
//Here in class name OA mean Optimal Approach
        // Find the GCD of n1 and n2
        int gcd = gcdFinder(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    static int gcdFinder(int num1, int num2){
      int step = 0;
        while (num1 > 0 && num2 > 0){
            if(num1 > num2){
                num1 = num1 % num2;
            }else {
                num2 = num2 % num1;
            }
            step++;
        }
        System.out.println(" Total Step " + step);
        return num1 > 0 ? num1 : num2;
    }
}
