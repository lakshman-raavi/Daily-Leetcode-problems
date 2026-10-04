class Solution {
    public String replaceDigits(String s) {
        // int n = s.length();

        // StringBuilder sb = new StringBuilder();
        // if (n % 2 == 0) {
        //     for (int i = 0; i < n; i += 2) {
        //         char ch = s.charAt(i);
        //         int val = s.charAt(i + 1);
        //         char newchar = (char) (ch-'0' + val);

        //         sb.append(ch);
        //         sb.append(newchar);
        //     }
        // } else {
        //     for (int i = 0; i < n-1; i += 2) {
        //         char ch = s.charAt(i);
        //         int val = s.charAt(i + 1);
        //         char newchar = (char) (ch-'0' + val);

        //         sb.append(ch);
        //         sb.append(newchar);
        //     }
        //     sb.append(s.charAt(n-1));
        // }

        // return sb.toString();

        char[] a = s.toCharArray();

        for (int i = 1; i < a.length; i += 2) {
            a[i] = (char) (a[i - 1] + (a[i] - '0'));
        }

        return new String(a);
    }
}
