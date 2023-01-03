package leetcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedColumnsTest {

    @Test
    void minDeletionSize() {
        int expected = 1;
        int expected2 = 0;
        int expected3 = 3;

        int result = SortedColumns.minDeletionSize(new String[]{"cba","daf","ghi"});
        int result2 = SortedColumns.minDeletionSize(new String[]{"a","b"});
        int result3 = SortedColumns.minDeletionSize(new String[]{"zyx","wvu","tsr"});

        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected2, result2);
        Assertions.assertEquals(expected3, result3);

    }
}