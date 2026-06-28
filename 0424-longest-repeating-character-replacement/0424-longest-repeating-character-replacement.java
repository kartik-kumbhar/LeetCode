class Solution {
    public int characterReplacement(String s, int k) {
        int maxWindow = 0;
        int j = 0;
        int maxfreq = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(ch));
            int window_size = i - j + 1;
            if (window_size - maxfreq > k) {
                char leftChar = s.charAt(j);
                map.put(leftChar, map.get(leftChar)-1);
                j++;
            }
            window_size = i - j + 1;
            maxWindow = Math.max(maxWindow, window_size);
        }
        return maxWindow;
    }
}