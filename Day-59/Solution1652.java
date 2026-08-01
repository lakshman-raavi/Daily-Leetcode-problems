class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if (k == 0) {
            return res;
        }

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int total = 0;
                for (int j = 1; j <= k; j++) {
                    total += code[(i + j) % n];
                }
                res[i] = total;
            }
            return res;
        }

        k = -k;
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 1; j <= k; j++) {
                total += code[(i - j + n) % n];
            }
            res[i] = total;
        }

        return res;
    }
}
