class Solution {

    public int backtrack(int idx, int[] arr1, int[] arr2, int n, int m, int[][][] dp) {
        if (idx < 0) {
            return 0;
        }
        if (dp[idx][n][m] != -1) {
            return dp[idx][n][m];
        }

        int notake = backtrack(idx - 1, arr1, arr2, n, m, dp);
        int take = 0;
        if (arr1[idx] <= n && arr2[idx] <= m) {
            take = 1 + backtrack(idx - 1, arr1, arr2, n - arr1[idx], m - arr2[idx], dp);
        }

        return dp[idx][n][m] = Math.max(take, notake);
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;

        int[] onearr = new int[len];
        int[] zeroarr = new int[len];

        for (int i = 0; i < len; i++) {
            int onec = 0;
            int zeroc = 0;
            for (int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                if (ch == '1') {
                    onec++;
                } else {
                    zeroc++;
                }
            }

            onearr[i] = onec;
            zeroarr[i] = zeroc;
        }
        int[][][] dp = new int[len + 1][n + 1][m + 1];

        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return backtrack(len - 1, onearr, zeroarr, n, m, dp);
    }
}
