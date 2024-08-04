package leetcode.arrays;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            System.out.println(word);
            int[] key = new int[26];
            for (char c : word.toCharArray()) {
                int i1 = key[c - 'a']++;
                System.out.println(i1);
            }

            String keyString = Arrays.toString(key);
            System.out.println(keyString);
            if (map.containsKey(keyString)) {
                map.get(keyString).add(word);
            } else {
                List<String> array = new ArrayList();
                array.add(word);
                map.put(keyString, array);
            }
        }
        return new ArrayList<>(map.values());
    }
}