class Solution {
    // public int backtrack(int i, String s1, String s2, int j, int[][] dp) {
    //     if (i < 0) {
    //         return j + 1;
    //     }
    //     if (j < 0) {
    //         return i + 1;
    //     }

    //     if (dp[i][j] != -1) {
    //         return dp[i][j];
    //     }

    //     if (s1.charAt(i) == s2.charAt(j)) {
    //         return dp[i][j]=backtrack(i - 1, s1, s2, j - 1, dp);
    //     }

    //     //insert

    //     int insert = 1 + backtrack(i, s1, s2, j - 1, dp);

    //     //delete

    //     int delete = 1 + backtrack(i - 1, s1, s2, j, dp);

    //     //replace

    //     int replace = 1 + backtrack(i - 1, s1, s2, j - 1, dp);

    //     return dp[i][j] = Math.min(insert, Math.min(delete, replace));

    // }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] prev=new int[m+1];
        for(int i=0;i<=m;i++){
            prev[i]=i;
        }
        int[] curr=new int[m+1];

        for (int i = 1; i <= n; i++) {
            curr[0]=i;
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    curr[j]=prev[j - 1];
                }
                else{
                //insert

                int insert = 1 + curr[j - 1];

                //delete

                int delete = 1 + prev[j];

                //replace

                int replace = 1 + prev[j - 1];
                

                curr[j] = Math.min(insert, Math.min(delete, replace));
                }
            }

            int[] temp=curr;
            curr=prev;
            prev=temp;
        }

        return prev[m];
    }
}
