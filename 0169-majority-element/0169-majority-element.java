class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // for (int i = 0; i < n; i++) {
        //     if (map.get(nums[i]) > n / 2) {
        //         return nums[i];
        //     }
        // }

        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}