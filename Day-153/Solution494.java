class Solution {
    // public int backtrack(int idx, int[] arr, int sum, int tar, int[][] dp) {
    //     if (idx == 0) {
    //         if (arr[idx] == 0 && arr[idx] + sum == tar) {
    //             return 2;
    //         }
    //         if (arr[idx] == 0 && sum - arr[idx] == tar) {
    //             return 2;
    //         }
    //         if (arr[idx] + sum == tar || sum - arr[idx] == tar) {
    //             return 1;
    //         }
    //         return 0;
    //     }

    //     if (dp[idx][tar] != -1) {
    //         return dp[idx][tar];
    //     }

    //     int neg = backtrack(idx - 1, arr, sum + (-arr[idx]), tar, dp);
    //     int pos = backtrack(idx - 1, arr, sum + arr[idx], tar, dp);

    //     return dp[idx][tar] = neg + pos;
    // }

    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }
        if ((total - target) < 0 || (total - target) % 2 != 0) {
            return 0;
        }

        int tar = (total - target) / 2;
        int[] prev=new int[tar+1];
        int[] curr=new int[tar+1];

        if (nums[0] == 0) {
            prev[0] = 2;
        } else {
            prev[0] = 1;
        }

        if (nums[0] != 0 && nums[0] <= tar) {
           prev[nums[0]] = 1;
        }

        for (int idx = 1; idx < n; idx++) {
            for (int sum = 0; sum <= tar; sum++) {
                int notake = prev[sum];
                int take = 0;
                if (nums[idx] <= sum) {
                    take = prev[sum - nums[idx]];
                }

                curr[sum] = (take + notake);
            }
            int[] temp=prev;
            prev=curr;
            curr=temp;
        }
        return prev[tar];
    }
}
