class Solution {

    // public int backtrack(int idx,int[] nums,int[] dp){
    //     if(idx<0){
    //         return 0;
    //     }
    //     if(idx==0){
    //         return nums[0];
    //     }
    //     if(dp[idx]!=-1){
    //         return dp[idx];
    //     }
        
    //     int take=nums[idx]+backtrack(idx-2,nums,dp);
    //     int notake=0+backtrack(idx-1,nums,dp);

    //     return dp[idx]=Math.max(take,notake);
    // }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // return backtrack(nums.length-1,nums,dp);

        // dp[0]=nums[0];
        // for(int i=1;i<n;i++){
        //     int take=nums[i];
        //     if(i>1){
        //         take+=dp[i-2];
        //     }
        //     int notake=dp[i-1];

        //     dp[i]=Math.max(take,notake);
        // }

        // return dp[n-1];

        int prev2=0;
        int curri=0;
        int prev=nums[0];

        for(int i=1;i<n;i++){
           int take=nums[i]+prev2;
            int notake=prev;

            curri=Math.max(take,notake);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}
