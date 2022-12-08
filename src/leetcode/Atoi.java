package leetcode;

class Atoi {
    public static void main(String[] args) {
        String s = "42";
        String s1 = "   -42";
        String s2 = "  4193 with words";
        System.out.println(myAtoi(s));
        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
    }

    public static int myAtoi(String s) {
        final String regex = "[^0-9+-]\\s*";
        final String replaceAll = s.replaceAll(regex, "");
        int result = 0;
        try {
            result = Integer.parseInt(replaceAll);
        } catch (NumberFormatException e){
            if (result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return result;
    }


}
