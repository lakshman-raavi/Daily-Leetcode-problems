class Solution {
    public String backtrack(int n, StringBuilder sb, List<String> list) {

        if (sb.length() == n) {
            if (!list.contains(sb.toString())) {
                return sb.toString();
            }
            return null;
        }

        sb.append('0');

        String ans = backtrack(n, sb, list);
        if (ans != null) {
            return ans;
        }

        sb.setLength(sb.length() - 1);

        sb.append('1');

        ans = backtrack(n, sb, list);
        if (ans != null) {
            return ans;
        }

        sb.setLength(sb.length() - 1);

        return null;
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        StringBuilder sb = new StringBuilder();

        return backtrack(n, sb, list);
    }
}
