package DynamicProgramming;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-18
 * @LastEditors: mianmiantea2019
 * @Description:
 */


public class _63UniquePathsIITest {
    _63UniquePathsII solution = new _63UniquePathsII();
    @Test
    public void testUniquePathsWithObstaclesTest1() {
        int[][] obstacleGrid1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected1 = 2;
        int result1 = solution.uniquePathsWithObstacles(obstacleGrid1);
        Assert.assertEquals(expected1, result1);
    }
    @Test
    public void testUniquePathsWithObstaclesTest2() {
        int[][] obstacleGrid2 = {{0, 1}, {0, 0}};
        int expected2 = 1;
        int result2 = solution.uniquePathsWithObstacles(obstacleGrid2);
        Assert.assertEquals(expected2, result2);
    }

    @Test
    public void testUniquePathsWithObstaclesSingleCell() {
        // Test case with a single cell grid
        int[][] obstacleGrid4 = {{0}};
        int expected4 = 1;
        int result4 = solution.uniquePathsWithObstacles(obstacleGrid4);
        Assert.assertEquals(expected4, result4);
    }
}


