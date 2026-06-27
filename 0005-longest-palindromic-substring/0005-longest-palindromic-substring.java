class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int max = 1;
        String sb = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                boolean isPal = isPalindrome(s.substring(i, j + 1));
                if (isPal && (j - i + 1) > max) {
                    max = j - i + 1;
                    sb = s.substring(i, j + 1);
                }
            }
        }
        return sb;
    }
}