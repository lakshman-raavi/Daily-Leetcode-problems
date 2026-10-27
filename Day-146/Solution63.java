class Solution {
    public int backtrack(int i,int j,int[][] dp,int[][] obstacleGrid){
        if(i==0 && j==0){
            return 1;
        }

        if(i<0 || j<0){
            return 0;
        }

        if(obstacleGrid[i][j]==1){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up=backtrack(i-1,j,dp,obstacleGrid);
        int left=backtrack(i,j-1,dp,obstacleGrid);

        return dp[i][j]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return backtrack(m-1,n-1,dp,obstacleGrid);
    }
}
