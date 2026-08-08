class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        List<Integer> indices = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indices.add(i);
            }
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int occurrence = queries[i];

            if (occurrence > indices.size()) {
                res[i] = -1;
            } else {
                res[i] = indices.get(occurrence - 1);
            }
        }

        return res;
    }
}
