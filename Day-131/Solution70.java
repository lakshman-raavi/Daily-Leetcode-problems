class Solution {
    public int backtrack(int[] dp, int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = backtrack(dp, n - 1) + backtrack(dp, n - 2);
    }

    public int climbStairs(int n) {

        //using linear complexity
        //    int f1=0,f2=1,f3=0;

        //     for(int i=0;i<n;i++)
        //     {

        //         f3=f1+f2;
        //         f1=f2;
        //         f2=f3;
        //     }
        //     return f3;

        //using dp
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return backtrack(dp, n);

    }
}
