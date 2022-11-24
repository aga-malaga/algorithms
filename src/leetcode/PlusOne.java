package leetcode;

import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne((new int[]{1, 2, 3, 9}))));
        System.out.println(Arrays.toString(plusOne((new int[]{1, 2, 3, 4}))));
        System.out.println(Arrays.toString(plusOne((new int[]{9}))));
        System.out.println(Arrays.toString(plusOne((new int[]{9,9,9,9}))));
        int[] arr = new int[10];
        System.out.println(Arrays.toString((arr)));
    }

    public static int[] plusOne(int[] digits) {
        final int length = digits.length;
        for (int i = length-1; i >= 0 ; i--) {
            if (digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[length+1];
        result[0] = 1;
        return result;
    }
}
