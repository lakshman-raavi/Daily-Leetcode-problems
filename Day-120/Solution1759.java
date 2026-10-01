class Solution {
    public static int mod=1000000007;
    public int countHomogenous(String s) {
        int n=s.length();
        char prev=s.charAt(0);
        int count=0;
        // int left=0;
        // for(int i=0;i<n;i++){
        //     if(prev==s.charAt(i)){
        //         count=(count+(i-left+1))%mod;
        //         prev=s.charAt(i);
        //     }
        //     else{
        //         left=i;
        //         prev=s.charAt(i);
        //         count=(count+1)%mod;
        //     }
        // }
        int left=1;
        for(int i=1;i<n;i++){
            if(prev==s.charAt(i)){
                left++;
                prev=s.charAt(i);
            }
            else{
                prev=s.charAt(i);
                count = (int)((count + (long)left * (left + 1) / 2) % mod);
                left=1;
            }
        }
         count = (int)((count + (long)left * (left + 1) / 2) % mod);
        return count%mod;
    }
}
