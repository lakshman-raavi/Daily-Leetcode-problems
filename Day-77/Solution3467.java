class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int ceven=0;
        for(int i=0;i<n;i++){
            if((nums[i]%2)==0){
                ceven++;
            }
        }

        for(int i=0;i<ceven;i++){
            nums[i]=0;
        }
        for(int i=ceven;i<n;i++){
            nums[i]=1;
        }
        return nums;
    }
}
