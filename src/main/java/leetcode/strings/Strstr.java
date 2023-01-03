package leetcode.strings;

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

        for (int i = 0; i < haystack.length(); i++) {
            int window = 0;
            while (window < needle.length()) {
                if (haystack.charAt(window + i) != needle.charAt(window)) {
                    break;
                }
                window++;
                if (window == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
