class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = 0;
        int sell = 1;
        int max_pro = 0;

        while(sell < prices.length){

            if(prices[buy] < prices[sell]){
                int profit = prices[sell] - prices[buy];
                max_pro = Math.max(max_pro, profit);
            }else{
                buy = sell;
            }
            sell++;

        }        
        return max_pro;
    }
}