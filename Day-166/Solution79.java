class Solution {
    public boolean backtrack(int i, int j, int k, char[][] board, String word, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }
        if (k >= word.length()) {
            return true;
        }

        boolean up = false;

        boolean left = false;

        boolean right = false;

        boolean bottom = false;

        if (board[i][j] == word.charAt(k)) {
            char ch = board[i][j];
            board[i][j] = '#';

            k++;
            up = backtrack(i - 1, j, k, board, word, n, m);

            if (up == true) {
                return true;
            }

            left = backtrack(i, j - 1, k, board, word, n, m);

            if (left == true) {
                return true;
            }

            right = backtrack(i, j + 1, k, board, word, n, m);

            if (right == true) {
                return true;
            }

            bottom = backtrack(i + 1, j, k, board, word, n, m);

            if (bottom == true) {
                return true;
            }

            board[i][j] = ch;

        } else {
            return false;
        }

        return false;

    }

    public boolean exist(char[][] board, String word) {

        boolean is = false;
        int n = board.length;
        int m = board[0].length;
        boolean found = false;
        if (n == 1 && m == 1 && word.length() == 1) {
            return board[0][0] == word.charAt(0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (backtrack(i, j, 0, board, word, n, m) == true) {
                    return true;
                }
            }
        }

        return is;

    }
}
