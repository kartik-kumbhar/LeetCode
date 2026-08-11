class Solution {
    public int maxProfit(int[] prices) {
        // int max =0;

        // for (int i = 0; i < prices.length - 1; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         int profit = prices[j] - prices[i];
        //         if (profit > max) {
        //             max = profit;
        //         }
        //     }

        // }
        // return max;

        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 1; i < prices.length; i++) {
            minprice = Math.min(minprice, prices[i]);
            int profit = prices[i] - minprice;
            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}