class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int count=0;

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            
            if(!set1.contains(nums[i-1])){
                set1.add(nums[i-1]);
                count++;
            }
            else if(!set2.contains(nums[i-1])){
                    set2.add(nums[i-1]);
                    count--;
            }
        }
        if (!set1.contains(nums[n - 1])) {
            set1.add(nums[n - 1]);
            count++;
        }
        else if (!set2.contains(nums[n - 1])) {
            set2.add(nums[n - 1]);
            count--;
        }
        
        
        return count;
    }
}
