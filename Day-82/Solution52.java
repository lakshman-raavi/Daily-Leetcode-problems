class Solution {

    public boolean isValid(int row, int col, char[][] board, int n) {

       for (int j = col; j >= 0; j--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Check lower-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public void solve(int col, Set<List<String>> res, char[][] board, int n) {
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isValid(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, res, board, n);
                board[row][col] = '.';
            }
        }
    }

    public int totalNQueens(int n) {
        Set<List<String>> res=new HashSet<>();
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        solve(0,res,board,n);
        return res.size();
    }
}
