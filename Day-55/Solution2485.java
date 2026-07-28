class Solution {
    public int pivotInteger(int n) {
        int[] prefix=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                prefix[i]=i+1;
            }
            else{
                prefix[i]=prefix[i-1]+(i+1);
            }
        }

        for(int i=0;i<n;i++){
            if(i==0){
                if(prefix[n-1]-prefix[i]==0){
                    return i+1;
                }
            }
            else if(i==n-1){
                if(prefix[i-1]==0){
                    return i+1;
                }
            }
            else{
                if(prefix[i-1]==(prefix[n-1]-prefix[i])){
                    return i+1;
                }

            }
        }
        return -1;
    }
}
