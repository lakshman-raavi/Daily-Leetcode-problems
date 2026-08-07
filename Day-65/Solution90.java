class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list=new HashSet<>();
        int n=nums.length;
        int subsets=(1<<n);

        for(int num=0;num<subsets;num++){
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0){
                    ans.add(nums[i]);
                }
            }
            list.add(ans);
        }
        return new ArrayList<>(list);
    }
}
