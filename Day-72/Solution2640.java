class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long[] res=new long[n];
        int max=nums[0];
        res[0]=nums[0]*2;
        int k=1;
        for(int i=1;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            res[k]=res[k-1]+nums[i]+max;
            k++;
        }
        return res;
    }
}
