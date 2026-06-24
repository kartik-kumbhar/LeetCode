class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return new int[] {};
        }
        int zero = 0;
        int index = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
                index = i;
            }
        }

        int answer[] = new int[nums.length];

        if (zero > 1) {
            // Arrays.fill(nums,0);
            return answer;

        } else if (zero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i != index) {
                    product *= nums[i];
                    answer[i] = 0;
                }
            }
            answer[index] = product;
        } else {
            for (int i = 0; i < nums.length; i++) {
                product *= nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
        }
        return answer;
    }
}