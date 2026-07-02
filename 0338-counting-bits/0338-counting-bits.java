class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            int count = 0;
            for (int j = 0; j < 32; j++) {
                int bitmask = 1 << j;
                if ((i & bitmask) != 0) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}