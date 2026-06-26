class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // HashMap<Character, Integer> m1 = new HashMap<>();
        // HashMap<Character, Integer> m2 = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0) + 1);
        //     m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0) + 1);

        // }

        // for (int i = 0; i < s.length(); i++) {
        //     if (!m1.get(s.charAt(i)).equals(m2.get(s.charAt(i)))) {
        //         return false;
        //     }
        // }

        /////////////////////////////////////////////////////
        // int[] count = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }

        // for (int num : count) {
        //     if (num != 0) return false;
        // }

        return true;

    }
}