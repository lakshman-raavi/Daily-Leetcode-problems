class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MAX_VALUE;

        int l=0;
        int r=k-1;
        while(r<n){
            max=Math.min(max,(nums[r]-nums[l]));
            l++;
            r++;
        }
        return max;
    }
}
