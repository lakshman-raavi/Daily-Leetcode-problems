class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }

        long a=0;
        long b=1;

        for(int i=0;i<n;i++){
            long temp=a+b;
            

            if(temp+a+b==n){
                return true;
            }
            if(temp+a+b>n){
                return false;
            }
            a=b;
            b=temp;
        }

        return false;
    }
}
