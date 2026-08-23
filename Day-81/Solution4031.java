class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans=new ArrayList<>();

        Set<Integer> arrele=new HashSet<>();

        for(int num:nums){
            arrele.add(num);
        }

        List<Integer> res=new ArrayList<>();
        int k=0;
        for(int i=lower;i<=upper;i++){
            if(!arrele.contains(i)){
                res.add(i);
            }
        }

        
        if(res.size()==0){
            return new ArrayList<>();
        }
        List<Integer> ele=new ArrayList<>();
        ele.add(res.get(0));
        for(int i=1;i<res.size();i++){
            
            int diff=res.get(i)-res.get(i-1);
            if(diff==1){
                continue;
            }
            else{
                ele.add(res.get(i-1));
                ans.add(new ArrayList<>(ele));
                ele.clear();
                ele.add(res.get(i));
            }
            
        }

        ele.add(res.get(res.size()-1));
        ans.add(new ArrayList<>(ele));
        return ans;
    }
}
