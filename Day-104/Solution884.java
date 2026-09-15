class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String ch : arr1) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (String ch : arr2) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<String> result = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);

    }
}
