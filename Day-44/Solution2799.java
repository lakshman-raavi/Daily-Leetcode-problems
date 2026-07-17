class Solution {
    public int cal(int[] nums,int k){
        if(k<0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int l=0;
        int r=0;
        int n=nums.length;
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                 map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }

                l++;
            }
            if(map.size()<=k){
                count += (r - l + 1);
            }
            r++;
        }
        return count;
    }
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int num : nums){
            set.add(num);
        }
        int c1=cal(nums,set.size());
        int c2=cal(nums,set.size()-1);
        return c1-c2;
    }
}
