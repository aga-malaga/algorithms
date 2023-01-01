package leetcode;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 8, 3, 4, 5, 7, 9, 2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int counter = 1;
            while (counter < arr.length) {
                if (arr[counter - 1] > arr[counter]) {
                    int temp = arr[counter];
                    arr[counter] = arr[counter - 1];
                    arr[counter - 1] = temp;
                }
                counter++;
            }
        }
        return arr;
    }
}
