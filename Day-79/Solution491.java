class Solution {

    public void funcal(int index, int[] nums, Set<List<Integer>> ans , List<Integer> ds, int n) {
        
            if (ds.size() >= 2) {
                ans.add(new ArrayList<>(ds));
            }
        

        for (int i = index; i < n; i++) {

            if (ds.isEmpty()) {
                ds.add(nums[i]);
                funcal(i + 1, nums, ans, ds, n);
                ds.remove(ds.size() - 1);
            } else {
                if (ds.get(ds.size() - 1) > nums[i]) {
                    continue;
                }

                ds.add(nums[i]);
                 if (ans.contains(ds)) {
                    ds.remove(ds.size() - 1);
                    continue;
                }
                funcal(i + 1, nums, ans, ds, n);
                ds.remove(ds.size() - 1);

            }

        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        funcal(0, nums, ans, new ArrayList<>(), n);
        return new ArrayList<>(ans);
    }
}
