class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            if (e.getValue().size() >= 3) {
                List<Integer> list = e.getValue();
                int l = 0;
                int r = 2;
                while (r < list.size()) {
                    int v2 = list.get(l);
                    int v1 = list.get(r);
                    int cal = 2 * (v1 - v2);
                    min = Math.min(min, (cal));
                    l++;
                    r++;
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
