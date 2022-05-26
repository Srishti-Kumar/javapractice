class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;//overall profit
        int pod = 0;//profit on that day
        int lsf = Integer.MAX_VALUE;//least so far value
        for(int i= 0;i < prices.length;i++){  
            if(prices[i] < lsf){ 
                lsf = prices[i];
            }
            pod = prices[i] - lsf;
            if(profit < pod){
                profit = pod;
            }                    
                                        
        }
        return profit;
    }
}
