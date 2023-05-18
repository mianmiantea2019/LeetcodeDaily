package DynamicProgramming;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-03 7:15 PM
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _62UniquePathsTest {
    _62UniquePaths solution = new _62UniquePaths();
    @Test
    public void testUniquePaths_case1() {
        int m = 3;
        int n = 7;
        int expectedPaths = 28;
        int actualPaths = solution.uniquePaths(m, n);
        Assertions.assertEquals(expectedPaths, actualPaths);
    }

    @Test
    public void testUniquePaths_case2() {
        int m = 3;
        int n = 2;
        int expectedPaths = 3;
        int actualPaths = solution.uniquePaths(m, n);
        Assertions.assertEquals(expectedPaths, actualPaths);
    }

    @Test
    public void testUniquePaths_case3() {
        int m = 1;
        int n = 1;
        int expectedPaths = 1;
        int actualPaths = solution.uniquePaths(m, n);
        Assertions.assertEquals(expectedPaths, actualPaths);
    }
}
