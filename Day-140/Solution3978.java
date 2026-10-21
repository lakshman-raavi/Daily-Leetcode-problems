class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=nums[n/2];
        int count=0;
        for(int i=0;i<n;i++){
            if(i!=(n/2)){
                if(nums[i]==mid){
                    count++;
                }
            }
            
            }
        return count==0;
    }
}
