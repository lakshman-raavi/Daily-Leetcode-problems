class Solution {
    public boolean ispowf(int n){
        return n%4==0;
    }
    public boolean canWinNim(int n) {
        if(n<=3){
            return true;
        }

        if(ispowf(n)==true){
            return false;
        }
        
        return true;
    }
}
