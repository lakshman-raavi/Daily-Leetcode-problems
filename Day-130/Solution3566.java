class Solution {
    public boolean backtrack(int idx,int[] nums,List<Integer> ds,int n,long tar){
        if(idx==n){
            long prod1=1;
            long prod2=1;
            for(int i=0;i<n;i++){
                if(!ds.contains(nums[i])){
                    prod1*=nums[i];
                }
                else{
                    prod2*=nums[i];
                }
                if(prod1>tar || prod2>tar){
                    return false;
                }
            }
            if(prod1==tar && prod2==tar){
                return true;
            }
            return false;
        }

        for(int i=idx;i<n;i++){
            ds.add(nums[i]);
            if(backtrack(i+1,nums,ds,n,tar)==true){
                return true;
            }
            ds.remove(ds.size()-1);
        }
        return false;

    }
    public boolean checkEqualPartitions(int[] nums, long target) {
        return backtrack(0,nums,new ArrayList<>(),nums.length,target);
    }
}
