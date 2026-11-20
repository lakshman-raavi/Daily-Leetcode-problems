class Solution {
    private static final int MOD = 1000000007;

    public int backtrack(int i, int j, int[][] grid, int rem, int k, int[][][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        
        int newRem = (rem + grid[i][j]) % k;
        
        if (i == 0 && j == 0) {
            return newRem == 0 ? 1 : 0;
        }
        
        if (dp[i][j][rem] != -1) {
            return dp[i][j][rem];
        }
        
        int up = backtrack(i - 1, j, grid, newRem, k, dp);
        int left = backtrack(i, j - 1, grid, newRem, k, dp);
        
        return dp[i][j][rem] = (up + left) % MOD;
    }

    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][k];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        
        return backtrack(n - 1, m - 1, grid, 0, k, dp);
    }
}
