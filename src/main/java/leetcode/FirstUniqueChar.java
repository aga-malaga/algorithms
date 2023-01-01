package leetcode;

import java.util.HashMap;
import java.util.Map;

class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar(s2));
        System.out.println(firstUniqChar(s3));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
