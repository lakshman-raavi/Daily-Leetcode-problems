class Solution {
    public int scoreOfString(String s) {
        int res=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            int score=Math.abs((int)s.charAt(i)-(int)s.charAt(i-1));
            res+=score;
        }
        return res;
    }
}
