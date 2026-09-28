class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                left++;
                max = Math.max(max, left - right);
            } 
            else if (ch == ')') {
                right++;
            }
        }

        return max;
    }
}
