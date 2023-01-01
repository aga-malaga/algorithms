package leetcode;

import java.util.Arrays;

class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 1, 1, 1,1,3,3,3,3,6,6,6,6,6,8,8};
        int[] array2 = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(array));
        System.out.println(removeDuplicates(array2));
    }


    public static int removeDuplicates(int[] nums) {
        int duplicate = 1;
        for (int i = 1; i < nums.length; i++) {
           if (nums[i - 1] != nums[i]){
               nums[duplicate] = nums[i];
               duplicate++;
           }
            System.out.println(Arrays.toString(nums));
        }
        return duplicate;
    }
}
