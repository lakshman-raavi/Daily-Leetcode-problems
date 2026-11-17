class Solution {
    public int backtrack(int idx,int[] nums,int prev,int[][] dp){

        if(idx<0){
            return 0;
        }
        
        if(dp[idx][prev]!=-1){
            return dp[idx][prev];
        }

        int notake=backtrack(idx-1,nums,prev,dp);
        int take=Integer.MIN_VALUE;
        if(prev==nums.length || nums[idx]<nums[prev]){
            take=1+backtrack(idx-1,nums,idx,dp);
        }

        return dp[idx][prev]=Math.max(take,notake);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return backtrack(n-1,nums,n,dp);

    }
}
