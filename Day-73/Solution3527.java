class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        Map<String, Integer> map = new HashMap<>();

        for (List<String> response : responses) {

            Set<String> set = new HashSet<>(response);

            for (String s : set) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        String ans = "";
        int max = 0;

        for (String s : map.keySet()) {

            if (map.get(s) > max) {
                max = map.get(s);
                ans = s;
            } 
            else if (map.get(s) == max && s.compareTo(ans) < 0) {
                ans = s;
            }
        }

        return ans;
    }
}
