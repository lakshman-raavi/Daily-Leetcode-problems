class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val=e.getValue();
            int key=e.getKey();
            if(val%k==0){
                res+=(val*key);
            }
        }

        return res;
    }
}
