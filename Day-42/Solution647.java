class Solution {
      public int funcal(String s,int l,int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            count+=funcal(s,i,i);
            count+=funcal(s,i,i+1);
        }
        return count;
    }
}
