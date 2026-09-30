class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean is=true;

        int n=s.length();
        for(int i=1;i<n;i++){
            if(Math.abs((s.charAt(i-1)-'0')-(s.charAt(i)-'0'))>2){
                return false;
            }
        }
        return true;
    }
}
