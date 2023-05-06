package dynamicProgramming;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-05 10:35 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */


public class _121BestTimetoBuyandSellStock {
   public int maxProfit(int[] prices) {
       if (prices == null || prices.length == 0)
           return 0;
       int minPrice = prices[0];
       int maxProfit = 0;
       for (int i = 1; i < prices.length; i++) {
           if (prices[i] < minPrice) {
               minPrice = prices[i];
           } else { 
               maxProfit = Math.max(maxProfit, prices[i] - minPrice);
           }
       }
       return maxProfit;
   }
}
