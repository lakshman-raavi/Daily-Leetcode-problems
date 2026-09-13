class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int xorsum = 0;
        int mod = 1000000007;

        for (int i = 0; i < queries.length; i++) {

            int idx = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];

            while (idx <= r) {
                nums[idx] = (int)(((long) nums[idx] * v) % mod);
                idx += k;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            xorsum ^= nums[i];
        }

        return xorsum;
    }
}
