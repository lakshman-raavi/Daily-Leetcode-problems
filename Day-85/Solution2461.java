class Solution {
   

    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        long sum=0;
        long max=0;
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            

            while(set.contains(nums[i]) || (i-left+1)>k){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[i]);
            sum+=nums[i];

            if(set.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
