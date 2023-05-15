package DFS;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-14
 * @LastEditors: mianmiantea2019
 * @Description:
 */
class _463IslandPerimeter {
    int result = 0;
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) {
        return 0;
    }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    getResult(grid, i, j);
                }
            }
        }
        return result;
    }

    private void getResult(int[][] grid, int i, int j) {
        result += 4;
        if (i > 0 && grid[i - 1][j] == 1) {
            result -= 2;
        }
        if (j > 0 && grid[i][j - 1] == 1) {
            result -= 2;
        }
    }
}
