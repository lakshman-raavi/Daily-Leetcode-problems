class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > k) {
            StringBuilder ans = new StringBuilder();
            int n = sb.length();
            for (int i = 0; i < n; i += k) {
                int res = 0;
                for (int j = i; j < Math.min(i + k, n); j++) {
                    res += sb.charAt(j) - '0';
                }
                ans.append(res);
            }
            sb = ans;
        }

        return sb.toString();
    }
}
