class Solution {

    public int longestPalindrome(String s) {

        int sum = 0;
        int odd = 0;
        int fre[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch]++;
        }

        for (int i = 0; i < fre.length; i++) {
            if (fre[i] % 2 == 0) {
                sum += fre[i];
            } else {
                sum += fre[i] - 1;
                odd = 1;
            }
        }
        sum += odd;
        return sum;

        // int fre[]=new int[128];
        // for(char ch:s.toCharArray()){
        //     fre[ch]++;
        // }
        // int length=0;
        // boolean odd=false;

        // for(int count:fre){
        //     length=length+count/2*2;
        //     if(count%2==1) odd=true;
        // }
        // return odd ? length+1:length;
    }
}
