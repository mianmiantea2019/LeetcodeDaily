
/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-09
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _130SurroundedRegions {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        // Traverse the boundary and mark the 'O' cells and their connected cells as '*'
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                markRegion(board, i, 0);
            }
            if (board[i][cols - 1] == 'O') {
                markRegion(board, i, cols - 1);
            }
        }
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                markRegion(board, 0, j);
            }
            if (board[rows - 1][j] == 'O') {
                markRegion(board, rows - 1, j);
            }
        }
        // Replace 'O' with 'X' and '*' with 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // Helper method to mark 'O' cells and their connected cells as '*'
    private static void markRegion(char[][] board, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != 'O') {
            return;
        }

        board[row][col] = '*';

        // Recursive calls for neighboring cells
        markRegion(board, row - 1, col); 
        markRegion(board, row + 1, col); 
        markRegion(board, row, col - 1); 
        markRegion(board, row, col + 1); 
    }
}
