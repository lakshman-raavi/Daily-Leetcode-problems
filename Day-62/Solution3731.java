class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int num : nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        int n=nums.length;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!list.contains(i)){
                res.add(i);
            }
        }

        return res;
    }
}
