package leetcode.arrays;

import leetcode.arrays.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void sort() {
        int[] given = {1, 6, 8, 3, 4, 5, 7, 9, 2};

        int[] expected = {1,2,3,4,5,6,7,8,9};

        Assertions.assertArrayEquals(expected, BubbleSort.sort(given));
    }
}