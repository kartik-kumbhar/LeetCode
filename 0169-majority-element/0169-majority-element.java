class Solution {
    public int majorityElement(int[] nums) {

        // Map<Integer, Integer> map = new HashMap<>();

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for (int num : map.keySet()) {
        //     if (map.get(num) > nums.length / 2) {
        //         return num;
        //     }
        // }
        // return 0;

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}