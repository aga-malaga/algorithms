package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate2(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate2(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate2(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
