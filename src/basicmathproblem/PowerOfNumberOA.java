package src.basicmathproblem;

public class PowerOfNumberOA {
    //Time Complexity of this Algorithm O(log 2 N); where x is number and N is the power of that number
    //Here in class name OA mean Optimal Approach

    public static void main(String[] args) {
        System.out.println(power(2, 7));
    }

    static long power(int number, int pow) {
        if (pow == 0) {
            return 1; // Handle the case where power is 0
        }

        long ans = 1;
    int step = 0;
     while (pow > 0){
         if(pow % 2 != 0){
             ans *= number;
             pow--;

         }else {
             number *= number;
             pow /= 2;

         }
         step++;
     }
        System.out.println("Step: " +step);
        return ans;
    }
}
