class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer> mapfreq=new HashMap<>();
        for(int val : map.values()){
            mapfreq.put(val,mapfreq.getOrDefault(val,0)+1);
        }

        for(int i=0;i<n;i++){
            int original = map.get(nums[i]);
            if(mapfreq.get(original)==1){
                return nums[i];
            }
        }

        return -1;

    }
}
