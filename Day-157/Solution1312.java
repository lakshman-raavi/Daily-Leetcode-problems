class Solution {
    // public int backtrack(String s1,String s2,int i,int j,int[][] dp){
    //     if(i<0 || j<0){
    //         return 0;
    //     }

    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         return dp[i][j]=1+backtrack(s1,s2,i-1,j-1,dp);
    //     }

    //     return dp[i][j]=Math.max(backtrack(s1,s2,i-1,j,dp),backtrack(s1,s2,i,j-1,dp));
    // }
    public int minInsertions(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        int[] prev=new int[n+1];
        int[] curr=new int[n+1];

        for(int i=0;i<=n;i++){
            prev[0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==sb.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
            int[] temp=curr;
            curr=prev;
            prev=temp;
        }
        
        return n-prev[n];
    }
}
