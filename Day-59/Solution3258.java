class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int total = 0;

        char[] arr = s.toCharArray();

        int n = s.length();
        int onec = 0;
        int zec = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') {
                zec++;
            } else {
                onec++;
            }

            while (l <= i && (zec > k && onec > k)) {
                if (arr[l] == '0') {
                    zec--;
                } else {
                    onec--;
                }
                l++;
            }

            total += (i - l + 1);
        }

        return total;
    }
}
