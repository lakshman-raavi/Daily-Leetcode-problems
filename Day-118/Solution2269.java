class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int div = num;

        int val = Integer.parseInt(sb.substring(0, k).toString());
        int count = 0;

        if (sb.charAt(0) != '0' && div % val == 0) {
            count++;
        }

        for (int i = 1; i <= sb.length() - k; i++) {
            String s = sb.substring(i, i + k).toString();

            if(Integer.parseInt(s) == 0) {
                continue;
            } else {
                int val1 = Integer.parseInt(s);
                if (div % val1 == 0) {
                    count++;
                }
            }
        }
        return count;

    }
}
