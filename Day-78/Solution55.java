class Solution {
    public boolean canJump(int[] nums) {
        boolean is = true;
        int idx = 0;
        int n = nums.length;
        int goal = n - 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            idx = (i + nums[i]);
            if (i> max) {
                return false;
            }
            max = Math.max(max, idx);

        }
        return true;
    }
}
