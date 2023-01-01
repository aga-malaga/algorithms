package leetcode;

class AddOne {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {3, 0, 0}, {1, 9, 9}};
        int[][] arr2 = new int[][]{{9, 9, 9}, {3, 0, 0}, {1, 9, 9}};
        add(arr);
        add(arr2);

    }

    public static void add(int[][] arr) {

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
    }
}


