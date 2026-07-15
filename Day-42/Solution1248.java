class Solution {

    public int rangeSum(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int sum=0;
        int l=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            if(sum<=goal){
                count+=(i-l+1);
            }
        }
        return count;
    }


    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        int count1=0;
        int count2=0;
        count1=rangeSum(nums,k);
        count2=rangeSum(nums,k-1);
        return count1-count2;
       
    }
}
