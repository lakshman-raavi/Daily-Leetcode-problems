class Solution {
    public int smallestNumber(int n) {
        
        int res=1;
        if(n==1){
            return 1;
        }
        while(res<n){
            res=(res<<1)|1;
        }

        return res;
    }
}
