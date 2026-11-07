class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        int position = 1;
        for (int i = 0; i < n; i++) {
            String s = strs[i];

            char[] chararr = strs[i].toCharArray();
            Arrays.sort(chararr);
            String sorted = String.valueOf(chararr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);

        }

        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            res.add(new ArrayList<>(e.getValue()));
        }

        return res;

    }
}
