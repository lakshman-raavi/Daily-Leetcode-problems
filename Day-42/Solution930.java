class Solution {
    public int rangeSum(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int sum=0;
        int l=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            if(sum<=goal){
                count+=(i-l+1);
            }
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int l=0;
        int sum=0;
        int count1=0;
        int count2=0;
        count1=rangeSum(nums,goal);
        count2=rangeSum(nums,goal-1);
        return count1-count2;
        
    }
}
