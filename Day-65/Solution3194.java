class Solution {
    public double minimumAverage(int[] nums) {
        double min = Double.MAX_VALUE;

        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n/2;i++){
            double cal=(nums[i]+nums[n-i-1])/2.0;
            min=Math.min(min,cal);
        }
        return min;
    }
}
