package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String s2 = "aacc", t2 = "ccac";
//        System.out.println(isAnagram2(s, t));
        System.out.println(isAnagram2(s2, t2));
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
            if (alphabet[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            while (count < t.length()) {
                if (map.containsKey(count)) {
                    count++;
                    continue;
                }
                if (s.charAt(i) == t.charAt(count)) {
                    map.put(count, s.charAt(i));
                    break;
                }
                count++;
            }
        }
        return map.size() == s.length();
    }


}
