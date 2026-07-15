class Solution {

    public int funcal(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }

    public String longestPalindrome(String s) {
        int n=s.length();
        int end=0;
        int st=0;
        for(int i=0;i<n;i++){
            int evlen=funcal(s,i,i);
            int oddlen=funcal(s,i,i+1);

            int len=Math.max(evlen,oddlen);
            if(len>(end-st)){
                st=i-(len-1)/2;
                end=i+len/2;
            }

        }
        return s.substring(st,end+1);
        
    }
}
    
