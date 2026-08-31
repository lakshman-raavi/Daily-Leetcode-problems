class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        int bit=0;
        for(int i=0;i<=n;i++){
            int val=i;
            int count=0;
            while(val>0){
                count++;
                val=(val&(val-1));
            }
            res[i]=count;
        }
        return res;
    }
}
