package leetcode;

class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
    }

    public static int firstUniqChar(String s) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(index) != s.charAt(i)) {
                continue;
            }
            return -1;

        }
        return index;
    }
}
