package leetcode.arrays;

import java.util.Arrays;

class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println((rotate3(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println((rotate3(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println((rotate3(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3)));
        System.out.println((rotate3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if ((i + k) < nums.length) {
                result[i] = nums[i + k];
            } else {
                result[i] = nums[(i + k) - nums.length];
            }
        }
        return result;
    }

    public static int rotate3(int[] nums, int k) {
        System.out.println("nums.length: " + nums.length + ", k: " + k);
        return nums.length % k;
    }

    public static int[] rotate2(int[] nums, int k) {
        int[] result = new int[nums.length];
        k = k % nums.length;
        int rotate = nums.length - k;
        for (int i = 0; i < nums.length; i++) {
            if (rotate >= nums.length) {
                rotate = rotate - nums.length;
            }
            result[i] = nums[rotate];
            rotate++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        return result;
    }
}
