class Solution {

    public int gcdfun(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int gcd = 0;

            for (int j = i; j < n; j++) {
                gcd = gcdfun(gcd, nums[j]);

                if (gcd < k)
                    break;

                if (gcd == k)
                    count++;
            }

        }
        return count;
    }
}
