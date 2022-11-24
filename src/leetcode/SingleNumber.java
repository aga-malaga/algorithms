package leetcode;

import java.util.Arrays;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int[] nums2 = new int[]{4, 4, 1, 2, 1, 2, 5};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums2));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int index = 0;

        while (index < nums.length - 1) {
            if (nums[index] != nums[index + 1]) {
                return nums[index];
            }
            index += 2;
        }
        return nums[nums.length - 1];
    }
}
