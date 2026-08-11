class Solution {
    public boolean isPalindrome(String s) {
        // if (s.length() == 1) {
        //     return true;
        // }

        // s = s.toLowerCase();
        // s = s.replaceAll("[^a-z0-9]", "");

        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        //         return false;
        //     }
        // }
        // return true;

        // if (s == " ") {
        //     return true;
        // }

        // s = s.toLowerCase();
        // s = s.replaceAll("[^a-z0-9]", "");

        // for (int i = 0; i < s.length() / 2; i++) {
        //     if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        //         return false;
        //     }
        // }
        // return true;

        if (s.length() == 1) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        char ch[] = s.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}