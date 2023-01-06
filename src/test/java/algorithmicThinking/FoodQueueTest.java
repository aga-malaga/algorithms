package algorithmicThinking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FoodQueueTest {

    @Test
    void solve() {
        int[] expected = {2, 3, 3, 4};

        int[] actual = FoodQueue.solve(new int[]{3, 2, 5}, 3, 4);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shortestLine() {
        int expected = 1;
        int expected2 = 4;

        int actual = FoodQueue.shortestLine(new int[]{2, 1, 4});
        int actual2 = FoodQueue.shortestLine(new int[]{2, 1, 4, 6, 0});

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}