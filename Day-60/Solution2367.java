class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff1=nums[j]-nums[i];
                if(diff1==diff){
                for(int k=j+1;k<n;k++){
                    int diff2=nums[k]-nums[j];
                    if(diff2==diff){
                        count++;
                    }
                }
                }
            }
        }
        return count;
    }
}
