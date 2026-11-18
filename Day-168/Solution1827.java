class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(i==0 || nums[i]>nums[i-1]){
                continue;
            }
            int k=nums[i];
            nums[i]=nums[i-1]+1;
            count+=(nums[i]-k);
            
        }

        return count;
        
    }
}
