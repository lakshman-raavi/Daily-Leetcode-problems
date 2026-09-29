class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }

        int sum=0;


        while(k!=0){
            sum+=(max);
            max+=1;
            k--;
        }

        return sum;
    }
}
