class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=Math.abs(nums[i]-nums[j]);
                int min=Math.min(nums[i],nums[j]);
                if(diff<=min){
                    int ans=nums[i]^nums[j];
                    max=Math.max(max,ans);
                }
            }
        }
        return max;
    }
}
