class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            long res = 0;
            for (int j = i; j < n; j++) {
                res += nums[j];
                String str = String.valueOf(res);
                if (str.charAt(0) - '0' == x && str.charAt(str.length() - 1) - '0' == x) {
                    count++;
                }
            }
        }

        return count;
    }
}
