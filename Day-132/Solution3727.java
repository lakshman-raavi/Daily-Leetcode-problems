class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        long sum=0;

        for(int i=0;i<n/2;i++){
            int last=(nums[n-i-1]);
            int first=(nums[i]);
            sum += ((long)last * last) - ((long)first * first);
        }
        if(n%2!=0){
            int last=(nums[n/2]);
            sum += ((long)last * last);
        }
        return sum;
    }
}
