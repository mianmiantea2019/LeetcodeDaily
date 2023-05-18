package DynamicProgramming;

import java.util.Arrays;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-18
 * @LastEditors: mianmiantea2019
 * @Description: https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class _746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[1] = 0;
        for (int i = 2; i <= cost.length ; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[cost.length];
    }
}
