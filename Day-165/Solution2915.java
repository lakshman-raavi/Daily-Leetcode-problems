class Solution {
    public int backtrack(int idx,List<Integer> arr,int tar,int[][] dp){

        if(tar==0){
            return 0;
        }
        if(tar<0){
            return Integer.MIN_VALUE;
        }
        if(idx<0){
            return Integer.MIN_VALUE;
        }
        if(dp[idx][tar]!=-1){
            return dp[idx][tar];
        }
        if(idx==0){
            if(arr.get(idx)==tar){
                return 1;
            }
            return Integer.MIN_VALUE;
        }


        int notake=backtrack(idx-1,arr,tar,dp);
        int take=Integer.MIN_VALUE;
        if(arr.get(idx)<=tar){
            take=1+backtrack(idx-1,arr,tar-arr.get(idx),dp);
        }

        return dp[idx][tar]=Math.max(take,notake);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n=nums.size();
        int[][] dp=new int[n][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res=backtrack(n-1,nums,target,dp);
        return res<0?-1:res;
    }
}
