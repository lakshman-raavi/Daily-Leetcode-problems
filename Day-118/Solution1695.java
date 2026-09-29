class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int sum = 0;

        int max = 0;

        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n && left < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
            while (map.get(nums[i]) > 1 && left < n) {
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                sum -= nums[left];
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            max = Math.max(max, sum);

        }

        return max;
    }
}
