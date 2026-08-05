class Solution {

    public long fungcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public long maxPairStrength(int[] nums) {
        long ans = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long gcd = fungcd(nums[i], nums[j]);
            
                long res = ((long) nums[i] * nums[j]) / (gcd * gcd);
                
                ans = Math.max(ans, res);
            }
        }

        return ans;
    }
}
