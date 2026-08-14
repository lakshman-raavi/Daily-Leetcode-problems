class Solution {
    public int[] productQueries(int n, int[][] queries) {

        int MOD = 1_000_000_007;

        int[] powers = new int[31];
        int k = 0;

        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                powers[k++] = 1 << i;
            }
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            long product = 1;

            for (int j = l; j <= r; j++) {
                product = (product * powers[j]) % MOD;
            }

            res[i] = (int) product;
        }

        return res;
    }
}
