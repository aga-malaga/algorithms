package leetcode;

class Strstr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        String haystack3 = "mississippi";
        String needle3 = "issip";
        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
    }

    public static int strStr(String haystack, String needle) {

        if (haystack.length() >= needle.length()) {
            for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                int indexN = 0;
                while (indexN < needle.length() && haystack.charAt(i + indexN) == needle.charAt(indexN)) {
                    indexN++;
                }
                if (indexN == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
