class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxfreq = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int ele=0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (maxfreq < map.get(nums[i])) {
                maxfreq = map.get(nums[i]);
                ele = nums[i];
            }
        }

        int sum=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int val=e.getValue();
            int key=e.getKey();

            
                if(val==maxfreq){
                    sum+=val;
                }
            
        }

        return sum;

    }
}
