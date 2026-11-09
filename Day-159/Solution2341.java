class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int pairs=0;
        int left=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val=e.getValue();
            int key=e.getKey();
            pairs+=(val/2);
            left+=(val%2);
        }

        return new int[]{pairs,left};
    }
}
