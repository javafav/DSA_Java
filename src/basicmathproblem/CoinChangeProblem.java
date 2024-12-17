package src.basicmathproblem;

import java.util.Arrays;
import java.util.HashMap;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int[] coins = { 2, 5}; // Coin denominations
        int returnAmount = 51;    // Amount to return
        HashMap<Integer, Integer> coinCount = new HashMap<>();

        boolean possible = coinChange(coins, returnAmount, coinCount);

        if (possible) {
            // Print the count of each coin used
            coinCount.forEach((coin, count) -> System.out.println(coin + " : " + count));
        } else {
            System.out.println("Cannot make the exact amount with the given coins.");
        }

    }

    static boolean coinChange(int[] coins, int returnAmount, HashMap<Integer, Integer> coinCount) {
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];
            int count = returnAmount / coin;
            returnAmount -= coin * count;
            coinCount.put(coin, count);
        }
        return returnAmount == 0;

    }
}
