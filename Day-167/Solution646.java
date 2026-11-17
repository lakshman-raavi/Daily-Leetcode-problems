class Solution {
    public int backtrack(int currow, int[][] pairs, int prevrow, int n,int[][] dp) {
        if (currow < 0) {
            return 0;
        }
        if(dp[currow][prevrow]!=-1){
            return dp[currow][prevrow];
        }
        int notake = backtrack(currow - 1, pairs, prevrow, n,dp);
        int take = 0;
        if (prevrow == n || pairs[currow][1] < pairs[prevrow][0]) {
            take = 1 + backtrack(currow - 1, pairs, currow, n,dp);
        }
        return dp[currow][prevrow]=Math.max(take, notake);
    }

    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;

        Arrays.sort(pairs,(a,b)-> Integer.compare(a[0],b[0]));
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(n - 1, pairs, n, n,dp);
    }
}
