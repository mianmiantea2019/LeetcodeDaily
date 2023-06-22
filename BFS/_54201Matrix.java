package BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-06-21
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _54201Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = -1;
                } else {
                    que.offer(new int[]{i, j});
                }
            }
        }

        int[][] dirs = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        while (!que.isEmpty()) {
            int[] curr = que.poll();
            for (int[] dir : dirs) {
                // find neighbours
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];
                // process cell with value -1
                if (x < 0 || x >= m || y < 0 || y >= n || (mat[x][y] != -1)) {
                    continue;
                }
                mat[x][y] = mat[curr[0]][curr[1]] + 1;
                que.offer(new int[]{x, y});
            }
        }
        return mat;
    }
}
