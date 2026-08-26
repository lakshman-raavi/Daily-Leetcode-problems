class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
        int[] dummy=new int[n];
        List<List<Integer>> res=new ArrayList<>();
        
        
        for(int i=0;i<n;i++){
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<n;j++){
            if(!ans.contains(nums[j]) && dummy[j]==0){
                ans.add(nums[j]);
                dummy[j]=1;
            }
            }
            if(ans.size()>0)
            res.add(ans);
        }
        return res;
    }
}
