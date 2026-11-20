
class Solution {
    public int backtrack(int i, int n,int[][] dp) {
        if (n == 0) {
            return 0;
        }
        if(n<0){
            return Integer.MAX_VALUE;
        }

        if (i == 1) {
            return n;
        }
        if(dp[i][n]!=-1){
            return dp[i][n];
        }

        int notake = backtrack(i - 1, n,dp);

        int take = Integer.MAX_VALUE;

        if ((i * i) <= n) {   
            take = 1 + backtrack(i, n - (i * i),dp);
        }

        return dp[i][n]=Math.min(take, notake);
    }

    public int numSquares(int n) {
        int range = (int) Math.sqrt(n);
        int[][] dp=new int[range+1][n+1];
        for(int i=0;i<=range;i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(range, n,dp);
    }
}
