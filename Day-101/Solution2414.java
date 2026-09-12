class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int n=s.length();
        int max=1;
        for(int i=1;i<n;i++){
            int currval=s.charAt(i)-'a';
            int prevval=s.charAt(i-1)-'a';
            int diff=currval-prevval;
            if(currval<prevval || diff<=0 || diff>1){
                count=1;
            }
            if(prevval<currval && diff==1){
                count++;
            }
            max=Math.max(max,count);
            
        }

        return max;
    }
}
