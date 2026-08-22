class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        if(temp%(sum+prod)==0){
            return true;
        }
        return false;
    }
}
