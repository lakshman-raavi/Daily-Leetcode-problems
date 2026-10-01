class Solution {
    public static int mod = 1000000007;

    public int numSub(String s) {
        int n = s.length();
        int count = 0;

        int left = 0;
        // for (int i = 0; i < n; i++) {

        //     if (s.charAt(i) == '0') {
        //         count = (int) ((count + (long) left * (left + 1) / 2) % mod);
        //         left = 0;
        //         continue;
        //     } else {
        //         left++;
        //     }

        // }
        // count = (int) ((count + (long) left * (left + 1) / 2) % mod);

        for(int i=0;i<n;i++){
            
            if (s.charAt(i) == '0') {
                left = i+1;
                continue;
            } else {
                count = (int) ((count + (long) (i-left+1)) % mod);
            }
        }
        return count;
    }
}
