class Solution {
    public void backtrack(int[] nums,int n, List<List<Integer>> ans,List<Integer> ds, boolean[] used){
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<n;i++){
            if(used[i]){
                continue;
            }
           if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) { 
                continue; 
            } 
            used[i]=true;
            ds.add(nums[i]);
            backtrack(nums,n,ans,ds,used);
            ds.remove(ds.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(nums,nums.length,ans,new ArrayList<>(),used);
        return ans;
    }
}
