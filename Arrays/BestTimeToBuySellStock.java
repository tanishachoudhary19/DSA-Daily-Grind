//Problem : https://leetcode.com/problems/top-k-frequent-elements/description/
//T.C: O(n)
//S.C: O(1)
// Status: Solved ✅ | Date: 2025-06-01

class BestTimeToBuySellStock{
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int Profit = prices[sell] - prices[buy];
                maxProfit = Math.max(Profit,maxProfit);
            }else{
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}