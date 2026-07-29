class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        int l=0;
        int r=n-1;
        int min=Integer.MAX_VALUE;
        while(l<r){
            int mid = l + (r - l) / 2;

            if(nums[l]==nums[mid] && nums[mid]==nums[r]){
                l++;
                r--;
                continue;
            }

            if(nums[mid]<min){
                min=nums[mid];
            }

            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
            
        }
        return Math.min(min, nums[l]);
    }
}
