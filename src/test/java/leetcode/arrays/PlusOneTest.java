package leetcode.arrays;

import leetcode.arrays.PlusOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    @Test
    void plusOne() {
        int[] arr = {1, 2, 3, 9};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {9};
        int[] arr4 = {9,9,9,9};

        int[] exp = {1, 2, 4, 0};
        int[] exp2 = {1, 2, 3, 5};
        int[] exp3 = {1, 0};
        int[] exp4 = {1, 0, 0, 0, 0};

        Assertions.assertArrayEquals(exp, PlusOne.plusOne(arr));
        Assertions.assertArrayEquals(exp2, PlusOne.plusOne(arr2));
        Assertions.assertArrayEquals(exp3, PlusOne.plusOne(arr3));
        Assertions.assertArrayEquals(exp4, PlusOne.plusOne(arr4));

    }
}