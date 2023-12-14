class Solution {
    public int maxProfit(int[] prices) {
//declare profit,stock purchase as stock and final ans for return
        int profit=0,stock=prices[0],ans=0;
        int n = prices.length;
    //ittrate loop from 1 index 
        for(int i=1;i<n;i++){
            // if price of stock less next day sell stock on same day and buy stock next day
            if(prices[i]<stock){
                stock = prices[i];
            }
//if next day price hike calculate the profit and add with ans
           if(prices[i]>prices[i-1]){
               profit=prices[i]-stock;
               stock = prices[i];
               ans+=profit;
           }
        }
        return ans;
    }
}