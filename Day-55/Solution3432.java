class Solution {
    public int countPartitions(int[] nums) {
        int lsum = nums[0];
        int rsum = 0;
        int n = nums.length;
        int count=0;
        for (int i = 1; i < n - 1; i++) {
            
            for (int j = i; j < n; j++) {
                rsum += nums[j];
            }
            if ((Math.abs(rsum - lsum)) % 2 == 0) {
                count++;
            }
            lsum += nums[i];
            rsum = 0;
        }
        if ((Math.abs(nums[n-1] - lsum)) % 2 == 0) {
            count++;
        }
        


        return count;
    }
}
