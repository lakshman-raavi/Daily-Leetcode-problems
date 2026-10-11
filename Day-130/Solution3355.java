class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] pref=new int[n];

        int m=queries.length;
        int count=0;
        for(int i=0;i<m;i++){
            int st=queries[i][0];
            int end=queries[i][1];

            pref[st]-=1;
            if(end+1<n){
                pref[end+1]+=1;
            }
        }
        if(nums[0]+pref[0]>0){
            return false;
        }
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+pref[i];
            nums[i]=nums[i]+pref[i];
            if(nums[i]>0){
                return false;
            }
        }
        return true;
    }
}
