package dynamicProgramming;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-06 10:31 AM
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _122BestTimetoBuyandSellStockII {
    public int maxSubArray(int[] nums) {
        int result=Integer.MIN_VALUE, previousVal = 0;
        for(int i=0;i<nums.length;i++){
            int now = Math.max(previousVal, 0) +nums[i];
            result = Math.max(result, now);
            previousVal = now;
        }
        return result;
    }
}
