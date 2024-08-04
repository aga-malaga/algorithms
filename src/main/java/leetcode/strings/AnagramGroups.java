package leetcode.strings;

import java.util.*;

public class AnagramGroups {

    public static void main(String[] args) {
        List<List<String>> lists = groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        lists.forEach(System.out::println);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = Arrays.toString(chars);

            if (map.containsKey(str)) {
                List<String> stringList = map.get(str);
                stringList.add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}