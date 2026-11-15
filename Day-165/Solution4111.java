class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int min=nums[i];
            int res=nums[i];
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
                res=(res & nums[j]);
                if(res==min){
                    count++;
                }
            }
        }

        return count;
    }
}
