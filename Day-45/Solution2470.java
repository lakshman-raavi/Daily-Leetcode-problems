class Solution {

    private int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private int findLcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;

        return Math.abs((a / findGcd(a, b)) * b);
    }

    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            int lcm = 1;

            for (int j = i; j < n; j++) {

                lcm = findLcm(lcm, nums[j]);

                if (lcm > k)
                    break;

                if (lcm == k)
                    count++;
            }
        }
        return count;
    }
}
