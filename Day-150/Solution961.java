class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val=e.getValue();
            int key=e.getKey();

            if(val==n/2){
                return key;
            }
        }
        
        return -1;
    }
}
