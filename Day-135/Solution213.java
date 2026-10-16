class Solution {

    public int backtrack1(int idx, int[] nums, int[] dp) {
        if (idx < 0) {
            return 0;
        }
        if (idx == 0) {
            return nums[0];
        }
        
        if (dp[idx] != -1) {
            return dp[idx];
        }

        int take = nums[idx] + backtrack1(idx - 2, nums, dp);
        int notake = 0 + backtrack1(idx - 1, nums, dp);

        return dp[idx] = Math.max(take, notake);
    }
    public int backtrack2(int idx, int[] nums, int[] dp) {
        if (idx <= 0) {
            return 0;
        }
        if (idx == 1) {
            return nums[1];
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }

        int take = nums[idx] + backtrack2(idx - 2, nums, dp);
        int notake = 0 + backtrack2(idx - 1, nums, dp);

        return dp[idx] = Math.max(take, notake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        if(n==1){
            return nums[0];
        }
        Arrays.fill(dp, -1);
        int ans1=backtrack1(nums.length - 2, nums, dp);
        Arrays.fill(dp, -1);
        int ans2=backtrack2(nums.length - 1, nums, dp);
        return Math.max(ans1,ans2);
    }
}
