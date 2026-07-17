class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums1.length];
        // for (int i = 0; i < nums2.length; i++) {
        //     int c = 0;
        //     for (int j = i + 1; j < nums2.length; j++) {
        //         if (nums2[i] < nums2[j]) {
        //             c++;
        //             map.put(nums2[i], nums2[j]);
        //             break;
        //         }
        //     }
        //     if (c == 0) {
        //         map.put(nums2[i], -1);
        //     }
        // }

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());

            }
            st.push(nums2[i]);
        }

        

        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}