class Solution {
    public int backtrack1(int idx,int[] nums,int[] dp){
        if(idx<0){
            return 0;
        }
        if(idx==0){
            return nums[0];
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int take=nums[idx]+backtrack1(idx-2,nums,dp);
        int notake=nums[idx]+backtrack1(idx-1,nums,dp);
        return dp[idx]=Math.min(take,notake);
    }

    public int backtrack2(int idx,int[] nums,int[] dp){
        if(idx<0){
            return 0;
        }
        if(idx==0){
            return nums[0];
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int take=nums[idx]+backtrack2(idx-2,nums,dp);
        int notake=nums[idx]+backtrack2(idx-1,nums,dp);
        return dp[idx]=Math.min(take,notake);
    }

    public int tabulation(int[] nums,int n){
        int[] dp=new int[n+1];
        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=dp[i-2];
            }
            int notake=nums[i]+dp[i-1];

            dp[i]=Math.min(take,notake);
        }

        return dp[n-1];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        // if(n==1){
        //     return cost[0];
        // }
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans1=backtrack1(n-1,cost,dp);
        // Arrays.fill(dp,-1);
        // int ans2= backtrack2(n-2,cost,dp);

        // return Math.min(ans1,ans2);


        int[] temp1=new int[n-1];
        int[] temp2=new int[n];

        for(int i=0;i<n-1;i++){
            temp1[i]=cost[i];
        }
        for(int i=0;i<n;i++){
            temp2[i]=cost[i];
        }

        int res1=tabulation(temp1,n-1);
        int res2=tabulation(temp2,n);

        return Math.min(res1,res2);
        
    }
}
