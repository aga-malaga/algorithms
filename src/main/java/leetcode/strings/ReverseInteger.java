package leetcode.strings;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */

class ReverseInteger {
    public int reverse(int x) {
        int finalResult = 0;

        while (x != 0) {
            int end = x % 10;
            int result = finalResult * 10 + end;
            if ((result - end) / 10 != finalResult) {
                return 0;
            }
            finalResult = result;
            x = x / 10;
        }
        return finalResult;
    }
}
