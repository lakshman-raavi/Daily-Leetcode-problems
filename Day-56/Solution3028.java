class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int step=0;
        int n=nums.length;
        int[] prefix=new int[n];

        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0;i<n;i++){
           
            if(i==n-1){
                if(prefix[i]<0){
                    return step;
                }
                else if(prefix[i]==0){
                    return ++step;
                }
            }
            else if(prefix[i]==0){
                step++;
            }
        }
        return step;
    }
}
