package com.oj.dynamicProgramming;

public class P121_Best_Time_to_Buy_and_Sell_Stock {
	public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 0) return 0;
        
        int minCur = prices[0];
        int res = 0;
        int i = 0;
        while (i < prices.length) {
            if (prices[i] <= minCur) {
                minCur = prices[i];                
            } else {
                res = (prices[i] - minCur > res) ?  prices[i] - minCur : res;
            }
            i++;
        }        
        return res;
    }
}
