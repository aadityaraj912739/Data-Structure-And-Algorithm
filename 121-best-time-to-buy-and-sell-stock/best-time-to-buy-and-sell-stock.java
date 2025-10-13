class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int n = prices.length;
        int max = 0;
        while(buy < n-1){
            sell = buy+1;
            while( sell < n  &&  prices[buy] < prices[sell]){
                int maxPro = prices[sell] - prices[buy];
                if(max < maxPro){
                    max = maxPro;
                }
                sell++;
            }
            buy++;
        }
        return max;
    }
}