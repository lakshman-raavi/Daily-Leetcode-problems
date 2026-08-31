class Solution {
    public int findPermutationDifference(String s, String t) {
        int n=t.length();
        int res=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=t.indexOf(ch);
            res+=Math.abs(idx-i);
        }

        
        return res;
    }
}
