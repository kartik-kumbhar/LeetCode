class Solution {
    public int[] productExceptSelf(int[] nums) {
        int index = 0;
        int zero = 0;

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
                index = i;
            }
        }
        int product = 1;
        if (zero > 1) {
            Arrays.fill(nums, 0);
        } else if (zero == 1) {
            for (int i = 0; i < n; i++) {
                if (i != index) {
                    product *= nums[i];
                    nums[i] = 0;
                }

            }
            nums[index] = product;

        } else {
            for (int i = 0; i < n; i++) {
                product *= nums[i];
            }
            for (int i = 0; i < n; i++) {
                nums[i] = product / nums[i];
            }
        }
        return nums;

    }
}