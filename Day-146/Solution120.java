class Solution {
    // public int backtrack(int i, int j, List<List<Integer>> triangle,int n,int[][] dp) {
        
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }

    //     if(i==n-1){
    //         return triangle.get(i).get(j);
    //     }
    //     // if(i>=n || j>=n){
    //     //     return Integer.MAX_VALUE;
    //     // }

        
    //     int down=triangle.get(i).get(j)+backtrack(i+1,j,triangle,n,dp);
    //     int downright=triangle.get(i).get(j)+backtrack(i+1,j+1,triangle,n,dp);

    //     return dp[i][j] = Math.min(down, downright);

    // }

    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n = triangle.size();
    //     // int[][] mat = new int[n][n];
    //     // for (int row = 0; row < triangle.size(); row++) {
    //     //     for (int col = 0; col < triangle.get(row).size(); col++) {
    //     //         mat[row][col] = triangle.get(row).get(col);
    //     //     }
    //     // }

    //     int[][] dp=new int[n][n];

    //     for(int i=0;i<n;i++){
    //         Arrays.fill(dp[i],-1);
    //     }

    //     return backtrack(0,0,triangle,n,dp);
    // }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] dp=new int[n];

        for(int i=0;i<n;i++){
            dp[i]=triangle.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--){
            int[] curr=new int[n];
            for(int j=i;j>=0;j--){
                int down=triangle.get(i).get(j)+dp[j];
                int downright=triangle.get(i).get(j)+dp[j+1];
                curr[j]=Math.min(down,downright);
            }
            dp=curr;
        }

        return dp[0];
    }
}
