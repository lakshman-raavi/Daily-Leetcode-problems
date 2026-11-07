class Solution {
    public List<List<Integer>> findDifference(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;

        List<List<Integer>> res = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        for (int num : num1)
            set1.add(num);

        Set<Integer> set2 = new HashSet<>();
        for (int num : num2)
            set2.add(num);

        List<Integer> first = new ArrayList<>(set1);

        List<Integer> sec = new ArrayList<>(set2);

        first.removeAll(set2);
        sec.removeAll(set1);

        res.add(first);
        res.add(sec);
        return res;
    }
}
