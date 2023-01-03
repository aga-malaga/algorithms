package leetcode.arrays;

import java.util.Arrays;

class RotateArray2 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5}, 3);
    }

    public static void rotate(int[] nums, int k){
        if (k == 0 || k == nums.length){
            return;
        }
        k = k % nums.length;
        int index = 0;
        for (int i = k - 1; i <= k; i++) {
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            index++;
        }
        System.out.println(Arrays.toString(nums));


    }
}
