class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int max = num % 10;
            while (num != 0) {
                max = Math.max(max, (num % 10));
                num /= 10;
            }
            String s = String.valueOf(nums[i]);
            String result = String.valueOf(max).repeat(s.length());

            res += Integer.parseInt(result); 
        }
        return res;
    }
}
