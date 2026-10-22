class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n +1) / 2;
        int actualSum=0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        // Arrays.sort(nums);
        // if (nums[nums.length - 1] != nums.length) {
        //     return nums.length;
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != i) {
        //         return i;
        //     }
        // }
        return expectedSum - actualSum;
    }
}