class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int count = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            count = 0;
            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    if (j != (num / j)) {
                        count += 2;
                    } else {
                        count++;
                    }
                }
            }
            if (count != 4) {
                continue;
            }

            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    res += (j);
                    if (j != (num / j)) {
                        res += (num / j);
                    }
                }
            }

        }

        return res;
    }
}
