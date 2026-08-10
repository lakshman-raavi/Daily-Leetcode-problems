class Solution {

    public List<Integer> funcr(int n, int r) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;

        for (int i = 0; i < r; i++) {
            ans.add((int) res);
            res = res * (n - i) / (i + 1);
        }

        return ans;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            res.add(funcr(i - 1, i));
        }

        return res;
    }
}
