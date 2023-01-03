package leetcode.arrays;

import java.util.Arrays;

class RunningSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));
    }

    public static int[] runningSum(int[] array){
        int[] result = new int[array.length];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            result[i] = sum;
        }
        return result;
    }
}
