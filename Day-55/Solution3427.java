class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            int st=Math.max(0,i-nums[i]);
            int last=i;
            if(st==last){
                sum+=prefix[st];
            }
            else{
                if(st==0){
                    sum+=prefix[last];
                }
                else{
                    sum+=(prefix[last]-prefix[st-1]);
                }
            }
        }
        return sum;
    } 
}
