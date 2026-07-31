class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            count += ((i / 8) + 1) * list.get(i).getValue();
        }
        return count;
    }
}
