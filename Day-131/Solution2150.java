
class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            int freq = map.get(nums[i]);

            if (freq == 1 && !map.containsKey(nums[i] + 1) && !map.containsKey(nums[i] - 1)) {
                res.add(nums[i]);
            }
        }

        return res;
    }
}
