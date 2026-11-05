class Solution {
    public int backtrack(int num, int x, int tar,int[][] dp) {
        if (tar == 0) {
            return 1;
        }
        if (tar < 0 || num == 0) {
            return 0;
        }

        if(dp[num][tar]!=-1){
            return dp[num][tar];
        }

        int notake = backtrack(num - 1, x, tar,dp);
        long cal = (long) Math.pow(num, x);
        int take = 0;
        if (cal <= tar) {
            take = backtrack(num - 1, x, (int)(tar - cal),dp);
        }

        return dp[num][tar]=(take + notake)%1000000007;
    }

    public int numberOfWays(int n, int x) {
        int range = (int) Math.floor(Math.pow(n, 1.0 / x) + 1e-10);
        int[][] dp=new int[range+1][n+1];
        for(int i=0;i<=range;i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(range, x, n,dp);
    }
}
