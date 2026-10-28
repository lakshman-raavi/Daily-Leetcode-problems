class Solution {
    public int backtrack(int i, int j, int[][] dp, int[][] grid, int m, int n) {
        if (i < 0 || j < 0 || j >= n) {
            return Integer.MAX_VALUE;
        }
        if (i == 0) {
            return grid[0][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int minFromPreviousRow = Integer.MAX_VALUE;
      
        for (int k = 0; k < n; k++) {
            if (k != j) {
                minFromPreviousRow = Math.min(minFromPreviousRow, backtrack(i - 1, k, dp, grid, m, n));
            }
        }

        return dp[i][j] = grid[i][j] + minFromPreviousRow;
    }

    public int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n + 1];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, backtrack(m - 1, i,dp, grid, m, n));
        }

        return min;
    }
}
