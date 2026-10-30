class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<2;i++){
            sum+=nums[i];
        }
        set.add(sum);
        

        int left=1;
        int right=2;

        while(right<n){
            sum=nums[left]+nums[right];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
            left++;
            right++;
        }
        return false;
    }
}
