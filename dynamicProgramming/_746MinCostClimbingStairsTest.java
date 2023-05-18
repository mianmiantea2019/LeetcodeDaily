package DynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-18
 * @LastEditors: mianmiantea2019
 * @Description: https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class _746MinCostClimbingStairsTest {
    @Test
    public void testMinCostClimbingStairs() {
        _746MinCostClimbingStairs solution = new _746MinCostClimbingStairs();

        // Test case 1: [10, 15, 20]
        int[] cost1 = {10, 15, 20};
        int expected1 = 15; // The minimum cost is 15, choosing the 1st and 3rd steps
        int result1 = solution.minCostClimbingStairs(cost1);
        assertEquals(expected1, result1);

        // Test case 2: [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected2 = 6; // The minimum cost is 6, choosing the 1st, 3rd, 5th, and 6th steps
        int result2 = solution.minCostClimbingStairs(cost2);
        assertEquals(expected2, result2);
    }
}

