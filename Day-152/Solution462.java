class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        int sum=0;
        Arrays.sort(nums);
        int med=0;
        if(n%2==0){
            med=(nums[n/2]+nums[n/2-1])/2;
        }
        else {
            med=nums[n/2];
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=(Math.abs(med-nums[i]));
        }
        return res;
    }
}
