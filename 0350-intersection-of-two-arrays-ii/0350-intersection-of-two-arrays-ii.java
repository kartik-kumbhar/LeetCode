class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        for (int num : nums1) {
            m1.put(num, m1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            m2.put(num, m2.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : m1.keySet()) {
            int min = Math.min(m1.getOrDefault(num, 0), m2.getOrDefault(num, 0));
            while (min > 0) {
                list.add(num);
                min--;
            }
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}