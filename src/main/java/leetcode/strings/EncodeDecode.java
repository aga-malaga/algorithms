package leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

    public static void main(String[] args) {
        String[] strings = {"we", "say", ":", "yes", "!@#$%^&*()"};
        String encoded = encode(Arrays.asList(strings));
        List<String> decode = decode(encoded);
        System.out.println(decode);
    }

    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String s : strs) {
            builder.append(s.length()).append("#").append(s);
        }
        return builder.toString();
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}