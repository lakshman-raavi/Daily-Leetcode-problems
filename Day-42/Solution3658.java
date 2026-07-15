class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=n*n;
        int evensum=n*(n+1);
        // for(int i=1;i<=2*n;i++){
        //     if((i%2)==0){
        //         evensum+=i;
        //     }
        //     else{
        //         oddsum+=i;
        //     }
        // }

        // int min=Math.min(oddsum,evensum);
        int res=0;
        for(int i=1;i<=oddsum;i++){
            if(oddsum%i==0 && evensum%i==0){
                res=i;
            }
        }
        return res;
    }
}
