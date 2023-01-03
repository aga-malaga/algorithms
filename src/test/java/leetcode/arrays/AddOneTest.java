package leetcode.arrays;

import leetcode.arrays.AddOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddOneTest {

    @Test
    void add() {
        int[][] arr = {{1, 2, 3}, {3, 0, 0}, {1, 9, 9}};
        int[][] arr2 = {{9, 9, 9}, {3, 0, 0}, {1, 9, 9}};

        int[][] expected = {{1, 2, 4}, {3, 0, 1}, {2, 0, 0}};
        int[][] expected2 = {{1, 0, 0, 0}, {3, 0, 2}, {2, 0, 0}};

        Assertions.assertArrayEquals(expected, AddOne.add(arr));
        Assertions.assertArrayEquals(expected2, AddOne.add(arr2));
    }
}
