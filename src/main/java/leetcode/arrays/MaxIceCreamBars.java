package leetcode.arrays;

import java.util.Arrays;

// At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins.
// The boy initially has coins to spend, and he wants to buy as many ice cream bars as possible.
//Return the maximum number of ice cream bars the boy can buy with coins.
//Note: The boy can buy the ice cream bars in any order.

class MaxIceCreamBars {

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int bars = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins && coins >= 0) {
                coins = coins - costs[i];
                bars++;
            }
        }
        return bars;
    }
}