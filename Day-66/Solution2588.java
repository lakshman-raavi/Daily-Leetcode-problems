class Solution {
    public long beautifulSubarrays(int[] nums) {
        int pref=0;
        long count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=nums.length;
        for(int i=0;i<n;i++){
            pref^=nums[i];
            if(map.containsKey(pref)){
                count+=map.get(pref);
            }
            map.put(pref,map.getOrDefault(pref,0)+1);
        }
        return count;
    }
}
