class Solution {
    public int backtrack(int idx, int[] cost,int[] dp) {

        if (idx == 0) {
            return 0;
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;

        if (idx - 1 >= 0)
            one = cost[idx - 1] + 1
                    + backtrack(idx - 1, cost,dp);

        if (idx - 2 >= 0)
            two = cost[idx - 1] + 4
                    + backtrack(idx - 2, cost,dp);

        if (idx - 3 >= 0)
            three = cost[idx - 1] + 9
                    + backtrack(idx - 3, cost,dp);

        return dp[idx]=Math.min(one, Math.min(two, three));
    }

    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return backtrack(n, costs,dp);
    }
}
