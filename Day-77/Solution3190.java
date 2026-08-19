class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            count+=Math.min(nums[i]%3,3-nums[i]%3);
        }
        return count;
    }
}
