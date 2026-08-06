class Solution {
    public int funprod(int n){
        int res=1;
        while(n!=0){
            res=res*(n%10);
            n/=10;
        }
        return res;
    }
    public int smallestNumber(int n, int t) {
        int res=n;

        while(true){
            int ans=funprod(n);
            if(ans%t==0){
                res=n;
                break;
            }
            n++;
        }
        return res;
    }
}
