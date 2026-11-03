class Solution {
    // public int backtrack(int idx, int[] arr, int tar, int[][] dp) {
    //     if (tar < 0) {
    //         return 0;
    //     }
    //     if (tar == 0) {
    //         return 1;
    //     }

    //     if (dp[idx][tar] != -1) {
    //         return dp[idx][tar];
    //     }
    //     if (idx == 0) {
    //         if (tar % arr[idx] == 0) {
    //             return 1;
    //         }
    //         return 0;
    //     }

    //     int notake = backtrack(idx - 1, arr, tar, dp);
    //     int take = 0;
    //     if (arr[idx] <= tar) {
    //         take = backtrack(idx, arr, tar - arr[idx], dp);
    //     }

    //     return dp[idx][tar] = take + notake;
    // }

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] prev = new int[amount + 1];
        int[] curr = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0) {
                prev[i] = 1;
            } else {
                prev[i] = 0;
            }
        }

        for (int idx = 1; idx < n; idx++) {
            for (int sum = 0; sum <= amount; sum++) {
                int notake = prev[sum];
                int take = 0;
                if (coins[idx] <= sum) {
                    take = curr[sum - coins[idx]];
                }

                curr[sum] = take + notake;
            }
            int[] temp = curr;
            curr=prev;
            prev=temp;
        }
        return prev[amount];
    }
}
