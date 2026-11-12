class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int len=1;
            int prev=nums[i];
            for(int j=i+1;j<n;j++){
                if(prev<nums[j]){
                    len++;
                }
                else{
                    break;
                }
                prev=nums[j];
            }
            max=Math.max(max,len);
        }

        for(int i=0;i<n;i++){
            int len=1;
            int prev=nums[i];
            for(int j=i+1;j<n;j++){
                if(prev>nums[j]){
                    len++;
                }
                else{
                    break;
                }
                prev=nums[j];
            }
            max=Math.max(max,len);
        }

        return max;

    }
}
