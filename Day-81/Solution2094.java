class Solution {

    public void backtrack(int n, StringBuilder sb, int[] nums,
                          boolean[] used, Set<Integer> ans) {

        if (sb.length() == 3) {
            int val = Integer.parseInt(sb.toString());

            if (val % 2 == 0) {
                ans.add(val);
            }

            return;
        }

        for (int i = 0; i < n; i++) {

           
            if (used[i]) {
                continue;
            }

           
            if (sb.length() == 0 && nums[i] == 0) {
                continue;
            }

           
            sb.append(nums[i]);
            used[i] = true;

        
            backtrack(n, sb, nums, used, ans);

            
            used[i] = false;
            sb.setLength(sb.length() - 1);
        }
    }

    public int[] findEvenNumbers(int[] digits) {

        Arrays.sort(digits);

        Set<Integer> ans = new TreeSet<>();

        int n = digits.length;
        boolean[] used = new boolean[n];

        backtrack(n, new StringBuilder(), digits, used, ans);

        int[] res = new int[ans.size()];

        int k = 0;
        for (int num : ans) {
            res[k++] = num;
        }

        return res;
    }
}
