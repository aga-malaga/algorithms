package leetcode.arrays;

class AddOne {

    public static int[][] add(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {
            for (int column = arr[row].length - 1; column >= 0 ; column--) {
                if (arr[row][column] != 9) {
                    arr[row][column]++;
                    break;
                }
                arr[row][column] = 0;

                }
            }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print(" ");

        }
        System.out.println();

        return arr;
    }
}


