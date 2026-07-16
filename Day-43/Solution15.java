class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();

            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(third);
                    Collections.sort(list);
                    res.add(list);
                }
                set.add(nums[j]);
            }
        }

        
        return new ArrayList<>(res);
    }
}
