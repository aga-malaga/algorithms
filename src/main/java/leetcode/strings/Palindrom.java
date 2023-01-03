package leetcode.strings;

class Palindrom {
    public static void main(String[] args) {
        String s = "race a car";
        String s2 = "A man, a plan, a canal: Panama";
        String s3 = " ";
        String s4 = "ab_a";
//        System.out.println(isPalindrome(s));
//        System.out.println(isPalindrome(s2));
//        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(" ")) {
            return true;
        }
        String result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int j = result.length() - 1;
        for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) != result.charAt(j) && j >= i) {
                    return false;
                }
                j--;
        }

        return true;
    }

}
