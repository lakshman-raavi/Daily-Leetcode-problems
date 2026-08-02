class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int onec=0;
        int zec=0;

        int count=0;
        int k=3;
        int l=0;
        int r=k-1;    
        while(r<n){
            if(nums[l]==0){
                for(int i=l;i<=r;i++){
                    if(nums[i]==1){
                        nums[i]=0;
                    }
                    else{
                        nums[i]=1;
                    }
                }
                count++;
            }
           l++;
           r++;
        }

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                return -1;
            }
        }
        return count;

    }
}
