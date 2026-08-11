class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> copy = new ArrayList<>();

        for (int num : nums) {
            copy.add(num);
        }

        while (copy.size() != 1) {
            int k = 0;
            for (int i = 0; i < copy.size() - 1; i++) {
                int ans = (copy.get(i) + copy.get(i + 1)) % 10;
                copy.set(i, ans);
            }
           copy.remove(copy.size() - 1);
        }

        return copy.get(0);
    }
}
