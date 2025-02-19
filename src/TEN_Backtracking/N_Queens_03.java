package TEN_Backtracking;

public class N_Queens_03 {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical top
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
        }
        //diagonal right
        for (int i = row - 1; i >= board.length; i--) {
            for (int j = col + 1; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X'; //backtrack
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("----Chess Board----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }
}
