class Solution {
    public boolean palindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isStrictlyPalindromic(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= n - 2; i++) {
            int temp = n;
            while (temp > 0) {
                sb.append(temp % i);
                temp /= i;
            }
            if(!palindrome(sb.reverse().toString())){
                return false;
            }
            sb.setLength(0);
        }

        return true;
    }
}
