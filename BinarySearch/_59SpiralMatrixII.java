package BinarySearch;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-03 7:15 PM
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _59SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1;
        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) { 
            for (int col = startCol; col <= endCol; col++) {
                res[startRow][col] = count++;
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                res[row][endCol] = count++;
            }

            if (startRow < endRow && startCol < endCol) {
                for (int col = endCol - 1; col > startCol; col--) { 
                    res[endRow][col] = count++;
                }

                print(n, res);
                for (int row = endRow; row > startRow; row--) { 
                    res[row][startCol] = count++;
                }
                print(n, res);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return res;
    }
}
