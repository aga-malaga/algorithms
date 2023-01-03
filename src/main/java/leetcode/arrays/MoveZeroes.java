package leetcode.arrays;

import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int[] nums2 = new int[]{0};
//        moveZeroes(nums);
        moveZeroes2(nums);
//        moveZeroes(nums2);
    }

    public static void moveZeroes2(int[] nums){
        int snowball = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                snowball++;
            }
            else if (snowball > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowball] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int counter = 0;
        int index = 0;
        int length = nums.length;

        if (nums.length == 1)  {
            return;
        }

        while (index < length){
            if (nums[index] != 0){
                int temp = nums[index];
                nums[counter] = temp;
                counter++;
            }
            index++;
        }

        int zeroes = length - counter;
        while (zeroes > 0){
            nums[length - zeroes] = 0;
            zeroes--;

        }
        System.out.println(Arrays.toString(nums));
    }
}
