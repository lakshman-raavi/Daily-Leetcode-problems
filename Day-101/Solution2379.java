class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int n = blocks.length();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            char ch = blocks.charAt(i);
            if (ch == 'W') {
                count++;
            }
        }

        min = Math.min(min, count);

        for (int i = k; i < n; i++) {
            char ch1 = blocks.charAt(i);
            char ch2 = blocks.charAt(i - k);
            if (ch1 == 'W') {
                count++;
            }

            if (ch2 == 'W') {
                count--;
            }

            min = Math.min(min, count);
        }

        return min;
    }
}
