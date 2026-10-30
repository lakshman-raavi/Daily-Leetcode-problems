class Solution {
    // public boolean backtrack(int idx, int tar, int[] arr, int[][] dp) {
    //     if (tar < 0) {
    //         return false;
    //     }
    //     if (tar == 0) {
    //         return true;
    //     }
    //     if (idx == 0) {
    //         return arr[0] == tar;
    //     }

    //     if (dp[idx][tar] != -1) {
    //         return dp[idx][tar] == 1;
    //     }

    //     boolean notake = backtrack(idx - 1, tar, arr, dp);
    //     boolean take = false;
    //     if (arr[idx] <= tar)
    //         take = backtrack(idx - 1, tar - arr[idx], arr, dp);

    //     dp[idx][tar] = (take || notake) ? 1 : 0;
    //     return dp[idx][tar] == 1;
    // }

    public boolean canPartition(int[] nums) {
        int totalsum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            totalsum += nums[i];
        }

        if (totalsum % 2 != 0) {
            return false;
        }

        int tar = totalsum / 2;
        // int[][] dp = new int[n][tar + 1];

        // for (int i = 0; i < n; i++) {
        //     Arrays.fill(dp[i], -1);
        // }
        
        // boolean[][] dpt=new boolean[n][tar+1];
        // for (int i = 0; i < n; i++) {
        //     dpt[i][0] = true;
        // }

        // if (nums[0] <= tar) {
        //     dpt[0][nums[0]] = true;
        // }


        boolean[] prev=new boolean[tar+1];
        boolean[] curr=new boolean[tar+1];

        prev[0]=true;
        curr[0]=true;
        if(nums[0]<=tar)
        prev[nums[0]]=true;


        for (int idx = 1; idx < n; idx++) {
            for (int k = 1; k <= tar; k++) {
                boolean notake = prev[k];
                boolean take = false;
                if (nums[idx] <= k){
                    take = prev[k - nums[idx]];
                }

                curr[k] = (take || notake);
            }
            boolean[] temp = prev; 
            prev = curr;           
            curr = temp; 
        }

        return prev[tar];
    }
}
