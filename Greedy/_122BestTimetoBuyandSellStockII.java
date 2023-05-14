package Greedy;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-06 12:31 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _122BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++ ) {
            int diff = prices[i] - prices[i-1];
            if (diff > 0) {
                result += diff;
            }
        }
        return result;
    }
}
