class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int res=0;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                res=Math.max(res,i);
            }
        }
        return res;
    }
}
