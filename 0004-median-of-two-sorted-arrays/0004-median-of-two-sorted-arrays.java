class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr[] = new int[n1 + n2];

        double median = 0;

        for (int i = 0; i < n1; i++) {
            arr[i] = nums1[i];
        }
        for (int i = n1; i < arr.length; i++) {
            arr[i] = nums2[i - n1];
        }
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            median = (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            int mid = arr.length / 2;
            median = arr[mid];
        }
        return median;
    }
}