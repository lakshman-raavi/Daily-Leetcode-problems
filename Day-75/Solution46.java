class Solution {
    public void backtrack(int[] nums,int n,List<List<Integer>> ans,boolean[] used,List<Integer> ds){
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for(int i=0;i<n;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            ds.add(nums[i]);
            backtrack(nums,n,ans,used,ds);
            ds.remove(ds.size()-1);
            used[i]=false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[n];
        backtrack(nums,n,ans,used,new ArrayList<>());
        return ans;
    }
}
