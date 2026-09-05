class Solution {
    public char hashChar(String s){
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            res+=(ch-'a');
        }
        return (char)('a'+(res%26));
    }
    public String stringHash(String s, int k) {
        String ans="";

        int n=s.length();
        int left=0;
        int right=k;
        while(right<=n){
            ans += hashChar(s.substring(left, right));
            left+=k;
            right+=k;
        }
        return ans;

    }
}
