
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int subsets = (1 << n);
        int maxOr = 0;
        

        for (int num : nums) {
            maxOr |= num;
        }
        
        int count = 0;
        
        for (int mask = 0; mask < subsets; mask++) {
            int currentOr = 0;
            for (int i = 0; i < n; i++) {
                
                if ((mask & (1 << i)) != 0) {
                    currentOr |= nums[i];
                }
            }
           
            if (currentOr == maxOr) {
                count++;
            }
        }
        
        return count;
    }
}
