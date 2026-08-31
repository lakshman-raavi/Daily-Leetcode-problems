class Solution {
    public long power(long x, long y, long mod) {
    long result = 1;

    while (y > 0) {
        if (y % 2 == 1) {
            result = (result * x) % mod;
        }

        x = (x * x) % mod;
        y /= 2;
    }

    return result;
}
    public int sumDecoded(long[] nums) {
        int n = nums.length;
        long mod = 1000000007L;
        long res = 0;

        for (int i = 0; i < n; i++) {
            int width = (int) (nums[i] % 10);
            long di = (long) Math.floor(nums[i] / 10);
            String s = Long.toString(di);
            long xi = Long.parseLong(s.substring(0, width));
            long yi = Long.parseLong(s.substring(width));
            res =(res+power(xi,yi,mod))%mod;

        }
        return (int)res;
    }
}
