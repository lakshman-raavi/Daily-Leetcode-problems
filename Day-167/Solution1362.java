class Solution {

    public int[] fun(int n){
        for(int i=(int)Math.sqrt(n);i>=1;i--){

            if(n%i==0){
                return new int[]{i,(n/i)};
            }
        }

        return new int[]{1,n};
    }
    public int[] closestDivisors(int num) {
        int[] res=new int[2];
        int[] res1=new int[2];

        
            res=fun(num+1);
            if(res[0]==res[1]){
                return res;
            }
            res1=fun(num+2);
            if(res1[0]==res1[1])
            return res1;
            
        

        int diff1=Math.abs(res[0]-res[1]);
        int diff2=Math.abs(res1[0]-res1[1]);
        if(diff1<=diff2){
            return res;
        }

        return res1;
    }
}
