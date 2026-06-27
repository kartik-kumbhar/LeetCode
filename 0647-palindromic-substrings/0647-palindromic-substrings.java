class Solution {
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int countSubstrings(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                boolean isPal = isPalindrome(s, i, j);
                if (isPal) {
                    count++;
                }
            }
        }
        return count;
    }
}