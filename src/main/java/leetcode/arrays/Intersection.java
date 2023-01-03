package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] nums3 = {1, 2, 2, 1};
        int[] nums4 = {2};
        System.out.println(Arrays.toString(intersect(nums3, nums4)));
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == nums2) {
            return nums1;
        }
        final int[] sort1 = sort(nums1);
        final int[] sort2 = sort(nums2);
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < sort1.length && j < sort2.length){
            if (sort1[i] > sort2[j]){
                j++;
            } else if (sort1[i] < sort2[j]){
                i++;
            } else {
                result.add(sort1[i]);
                i++;
                j++;
            }
        }

        return resultToArray(result);
    }

    private static int[] sort(final int[] nums2) {
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 1; j < nums2.length - i; j++) {
                if (nums2[j - 1] > nums2[j]) {
                    int temp = nums2[j - 1];
                    nums2[j - 1] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }
        return nums2;
    }

    private static int[] resultToArray(List<Integer> result) {
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        return intersection;
    }
}