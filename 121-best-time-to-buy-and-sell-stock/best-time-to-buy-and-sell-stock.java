class Solution {
    public int maxProfit(int[] prices) {
        int minPrize = prices[0];
        int maxProfit = 0;
        int i = 0;
        int n = prices.length;
        while(i < n){
            if(prices[i] <= minPrize){
                minPrize = prices[i];  
            }else{
                int temp = prices[i] - minPrize;
                if(maxProfit < temp){
                    maxProfit = temp;
                }
            }
            i++;
        }
        return maxProfit;
        
    }
}