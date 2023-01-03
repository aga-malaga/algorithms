package leetcode.arrays;

class BubbleSort {

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
