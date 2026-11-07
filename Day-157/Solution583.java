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
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();

        int[] prev=new int[n2+1];
        for(int i=0;i<=n2;i++){
            prev[0]=0;
        }

        int[] curr=new int[n2+1];


        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
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
        int res=prev[n2];

        return (n1-res)+(n2-res);
        
    }
}
