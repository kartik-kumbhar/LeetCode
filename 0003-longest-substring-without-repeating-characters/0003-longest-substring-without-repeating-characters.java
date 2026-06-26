class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (sb.toString().contains("" + s.charAt(i))) {
                while (sb.toString().contains("" + s.charAt(i))) {
                    sb = sb.deleteCharAt(0);
                }
                sb.append(s.charAt(i));
                max = Math.max(max, sb.length());
            } else {
                sb.append(s.charAt(i));
                max = Math.max(max, sb.length());
            }

        }
        return max;
        
    }
}