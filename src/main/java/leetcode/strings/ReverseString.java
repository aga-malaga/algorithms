package leetcode.strings;

import java.util.Arrays;
import java.util.Stack;

class ReverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] s2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseStack(s);
        reverseStack(s2);
    }

    public static void reverseString(char[] s) {
        int back = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[back];
            s[back] = temp;
            back--;
        }
    }

    public static void reverseStringRecursion(char[] s) {
        int i = 0;
        int j = s.length - 1;
        solve(s, i, j);

    }

    public static void solve(char[] s, int i, int j) {
        if (i > s.length / 2) {
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        solve(s, ++i, --j);

    }

    public static void reverseStack(char[] s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        int j = 0;
        while (!stack.isEmpty()){
            s[j] = stack.pop();
            j++;
        }
        System.out.println(Arrays.toString(s));
    }
}
