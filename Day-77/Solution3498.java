class Solution {
    public int reverseDegree(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            count += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return count;
    }
}
