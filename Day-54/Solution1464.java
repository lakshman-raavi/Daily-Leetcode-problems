class Solution {
    public int maxProduct(int[] nums) {
        int res=0;
        int maxres=0;
       int fmax=Integer.MIN_VALUE;
       int smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>fmax){
                smax=fmax;
                fmax=nums[i];
            }
            else if(nums[i]>smax){
                smax=nums[i];
            }
        }

        res=(fmax-1)*(smax-1);
        return res;
    }
}
