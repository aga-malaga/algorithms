package leetcode.arrays;

class SortedColumns {

    public static int minDeletionSize(String[] strs) {
        int charr = 0;
        int result = 0;
        while (charr < strs[0].length()) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(charr) > strs[i + 1].charAt(charr)) {
                    result += 1;
                    break;
                }
            }
            charr++;
        }
        return result;
    }

}
