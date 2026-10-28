class Solution {
    // public int backtrack(int i, int j, int[][] dp, int[][] matrix, int m, int n) {
    //     if (i < 0 || j < 0 ||  j>=n) {
    //         return Integer.MAX_VALUE;
    //     } 
    //     if (i == 0) {
    //         return matrix[0][j];
    //     }

    //     if (dp[i][j] != -1) {
    //         return dp[i][j];
    //     }

    //     int up = backtrack(i - 1, j, dp, matrix, m, n);

    //     int left = backtrack(i - 1, j - 1, dp, matrix, m, n);

    //     int right = backtrack(i - 1, j + 1, dp, matrix, m, n);

    //     return dp[i][j] = matrix[i][j] + Math.min(up, Math.min(left, right));
    // }

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] prev = new int[n];
        int[] curr = new int[n];

        for (int i = 0; i < n; i++) {
            prev[i] = matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = matrix[i][j] + prev[j];
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    left = matrix[i][j] + prev[j - 1];
                }
                if (j + 1 < n) {
                    right = matrix[i][j] + prev[j + 1];
                }

                curr[j] = Math.min(up, Math.min(left, right));
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        int min = prev[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prev[i]);
        }
        return min;
    }
}
