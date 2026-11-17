class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int res : nums) {

            for (int i = 2; i * i <= (res); i++) {
                if (res % i == 0) {
                    set.add(i);
                    while (res % i == 0) {
                        res /= i;
                    }
                }
            }

            if (res > 1) {
                set.add(res);
            }
        }

        return set.size();
    }
}
