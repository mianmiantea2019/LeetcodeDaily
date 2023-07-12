package DynamicProgramming;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-07-12
 * @LastEditors: mianmiantea2019
 * @Description: https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/
 * 
 */
public class _2110NumberofSmoothDescentPeriodsofaStock {
    public long getDescentPeriods(int[] prices) {
        int len = prices.length;
        long ans = 0;
        for (int j = 0, i = -1; j < len; ++j) {
            if (j != 0 && prices[j] + 1 != prices[j - 1]) {
                i = j - 1;
            }
            ans += j - i;
        }
        return ans;
    }
}
