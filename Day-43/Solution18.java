class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> set1 = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                     long fourth = (long) target - nums[i] - nums[j] - nums[k];
                    if (fourth >= Integer.MIN_VALUE &&
                        fourth <= Integer.MAX_VALUE && set1.contains((int)fourth)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int)fourth);
                        Collections.sort(list);
                        set.add(list);
                    }
                    set1.add(nums[k]);
                }
            }

        }
        return new ArrayList<>(set);
    }
}
