class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            String s1=String.valueOf(nums[i]);
            String s2=String.valueOf(nums[i+1]);
            String res=s1+s2;
            min=Math.min(min,Integer.parseInt(res));
        }
        return min;
    }
}
