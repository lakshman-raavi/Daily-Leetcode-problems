class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;
        int k = 1;
        

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        
        for (int i = 1; i < k - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) || 
                (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                ans++;
            }
        }
        
        return ans;
    }
}
