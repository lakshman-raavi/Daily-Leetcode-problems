class Solution {
    public static int MOD = 1000000007;

    public int backtrack(int i, int j, int moves, int st, int end, int[][][] dp) {
        if (moves == 0) {
            if (i < 0 || j < 0 || i >= st || j >= end) {
                return 1;
            }
            return 0;
        }

        if (i < 0 || j < 0 || i >= st || j >= end) {
            return 1;
        }
        if (dp[i][j][moves] != -1) {
            return dp[i][j][moves];
        }
        int up = backtrack(i - 1, j, moves - 1, st, end, dp);
        int right = backtrack(i, j + 1, moves - 1, st, end, dp);
        int left = backtrack(i, j - 1, moves - 1, st, end, dp);
        int down = backtrack(i + 1, j, moves - 1, st, end, dp);

        return dp[i][j][moves] = (((up + right) % MOD) + ((left + down) % MOD)) % MOD;
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        int[][][] dp = new int[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return backtrack(startRow, startColumn, maxMove, m, n, dp);
    }
}
