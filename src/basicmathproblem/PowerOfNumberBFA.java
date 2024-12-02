package src.basicmathproblem;

public class PowerOfNumberBFA {
    public static void main(String[] args) {

        //Time Complexity of this Algorithm O(N); where x is number and n is the power
        //Here in class name * BFA * mean Brute Force Approach

        power(2,5);
    }
    static long power(int number, int pow){
        long ans = 1;
        for(int i=1; i <= pow; i++){
            ans *= number;

        }
        System.out.println(ans);
        return ans;
    }
}
