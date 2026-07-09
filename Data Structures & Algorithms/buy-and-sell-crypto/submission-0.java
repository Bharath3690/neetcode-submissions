class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprices = prices[0];
        for(int i=0;i<prices.length;i++){
            minprices = Math.min(minprices,prices[i]);
            maxprofit = Math.max(maxprofit,Math.abs(minprices-prices[i]));
        }
        return maxprofit;
    }
}
