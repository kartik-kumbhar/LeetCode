class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        // Arrays.fill(ans, 1);
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j) {
        //             ans[i] *= nums[j];
        //         }
        //     }
        // }
        // return ans;

        int zero = 0;
        int index = 0;
        int mul = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
                index = i;
            }
        }

        if (zero > 1) {
            return ans;
        } else if (zero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i != index) {
                    mul *= nums[i];
                    ans[i] = 0;
                }
            }
            ans[index] = mul;
        } else {
            for (int i = 0; i < nums.length; i++) {
                mul *= nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                ans[i] = mul / nums[i];
            }

        }

        return ans;

    }
}