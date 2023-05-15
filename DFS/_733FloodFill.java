package DFS;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-14
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _733FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int current = image[sr][sc];
        if (current != color) {
            dfs(image, sr, sc, current, color);
        }
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int targetColor, int newColor) {
        int m = image.length;
        int n = image[0].length;
        if (sr < 0 || sr >= m || sc < 0 || sc >= n || image[sr][sc] != targetColor) {
            return;
        }
        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, targetColor, newColor); // Up
        dfs(image, sr + 1, sc, targetColor, newColor); // Down
        dfs(image, sr, sc - 1, targetColor, newColor); // Left
        dfs(image, sr, sc + 1, targetColor, newColor); // Right
    }
}
