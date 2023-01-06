package leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxIceCreamBarsTest {

    @Test
    void maxIceCream() {
        int[] costs = {1, 3, 2, 4, 1};
        int[] costs2 = {10, 6, 8, 7, 7, 8};
        int coins = 7;
        int coins2 = 5;

        int expected = 4;
        int expected2 = 0;

        Assertions.assertEquals(expected, MaxIceCreamBars.maxIceCream(costs, coins));
        Assertions.assertEquals(expected2, MaxIceCreamBars.maxIceCream(costs2, coins2));
    }
}