class Solution {
    public void funrec(int num,int k,List<List<Integer>> ans,List<Integer> ds,int n){
        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=num;i<=n;i++){
        ds.add(i);
        funrec(i+1,k,ans,ds,n);
        ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
         funrec(1,k,ans,new ArrayList<>(),n);
         return ans;
    }
}
