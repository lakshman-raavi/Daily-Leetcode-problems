class Solution {
    public int subsetXORSum(int[] nums) {
       int sum=0;
       int n=nums.length;
       int subsets = 1 << n;
       for(int num=0;num<subsets;num++){
            int xor=0;
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0){
                    xor^=nums[i];
                }
            }
            sum+=xor;
       }
       return sum;
    }
}
