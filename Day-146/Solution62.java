class Solution {
    // public void backtrack(int i,int j,int n,int m,boolean[][] visited,Set<ArrayList<String>> set,StringBuilder sb){

    //     //base case
    //     if(i==n-1 && j==m-1){
    //         set.add(new ArrayList<>(List.of(sb.toString())));
    //         return;
    //     }
    //     //right
    //     if(j+1<m && !visited[i][j+1]){
    //         visited[i][j+1]=true;
    //         backtrack(i,j+1,n,m,visited,set,sb.append('R'));
    //         visited[i][j+1]=false;
    //     }

    //     //down
    //     if(i+1<n && !visited[i+1][j]){
    //         visited[i+1][j]=true;
    //         backtrack(i+1,j,n,m,visited,set,sb.append('D'));
    //         visited[i+1][j]=false;
    //     }
    // }
    // public int uniquePaths(int m, int n) {
    //     Set<ArrayList<String>> set = new HashSet<>();
    //     boolean[][] visited=new boolean[m][n];
    //     backtrack(0,0,m,n,visited,set,new StringBuilder());
    //     return set.size();
    // }

   

        public int backtrack(int i, int j, int[][] dp) {

            if (i == 0 && j == 0) {
                return 1;
            }

            if (i < 0 || j < 0) {
                return 0;
            }

            if (dp[i][j] != -1) {
                return dp[i][j];
            }

            int up = backtrack(i - 1, j, dp);
            int left = backtrack(i, j - 1, dp);

            return dp[i][j] = up + left;
        }

        public int uniquePaths(int m, int n) {

            int[][] dp = new int[m][n];

            for (int i = 0; i < m; i++) {
                Arrays.fill(dp[i], -1);
            }

            return backtrack(m - 1, n - 1, dp);
        }
    

}
