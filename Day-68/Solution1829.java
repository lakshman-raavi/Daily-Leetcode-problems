class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] res = new int[n];

        int[] xorpre = new int[n];

        xorpre[0] = nums[0];

        for (int i = 1; i < n; i++) {
            xorpre[i] = xorpre[i - 1] ^ nums[i];
        }

        int maxValue = (1 << maximumBit) - 1;

        for (int i = n - 1; i >= 0; i--) {
            int xor = xorpre[i];

            int k = xor ^ maxValue;

            res[n - 1 - i] = k;
        }

        return res;
    }
}
