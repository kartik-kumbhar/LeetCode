class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length - 1];
        int gcd = 1;
        if (large % small == 0) {
            return small;
        }
        for (int i = 2; i <= small; i++) {
            if (small % i == 0 && large % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}