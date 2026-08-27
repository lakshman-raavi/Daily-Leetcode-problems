class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        int m=0;
        if(n==1 || k==1){
            return nums;
        }
        
        for(int i=0;i<n-k+1;i++){
            int max=-1;
            for(int j=i+1;j<i+k;j++){
                int diff=nums[j]-nums[j-1];
                if(diff!=1){
                    max=-1;
                    break;
                }
                else{
                    max=nums[j];
                }
            }
            res[i]=max;
        }
        return res;
    }
}
