package leetcode.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    private ReverseInteger rev;

    @BeforeEach
    void create() {
        rev = new ReverseInteger();
    }

    @Test
    void test() {
        int given = 123;
        int expected = 321;
        int actual = rev.reverse(given);

        int given2 = -123;
        int expected2 = -321;
        int actual2 = rev.reverse(given2);

        int given3 = 120;
        int expected3 = 21;
        int actual3 = rev.reverse(given2);

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected, actual);
    }

}