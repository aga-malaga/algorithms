package leetcode;

import java.util.Arrays;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int[] nums2 = new int[]{4, 4, 1, 2, 1, 2, 5};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums2));
    }

    public static int singleNumber(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i = i + 2){
            if (arr[i] != arr[i + 1]){
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    public static int singleNumber2(int[] nums) {
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
