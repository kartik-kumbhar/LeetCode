class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;
        // StringBuilder sb = new StringBuilder("");
        // for (int i = 0; i < n; i++) {
        //     char ch = s.charAt(i);
        //     while (sb.indexOf(String.valueOf(ch)) != -1) {
        //         sb.deleteCharAt(0);

        //     }
        //     sb.append(ch);
        //     count = Math.max(count, sb.length());

        // }
        // return count;

        HashSet<Character> set = new HashSet<>();

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            count = Math.max(count, set.size());
        }

        return count;
    }
}