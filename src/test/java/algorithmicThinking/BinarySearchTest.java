package algorithmicThinking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;

        int expected = 4;
        int expected2 = -1;

        int actual = BinarySearch.search(nums, target);
        int actual2 = BinarySearch.search(nums2, target2);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2);
    }
}