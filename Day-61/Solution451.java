class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            int cmp = b.getValue().compareTo(a.getValue());
            if (cmp == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return cmp;
        });

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character, Integer> e : list){
            char ch=e.getKey();
            int val=e.getValue();

            for(int i=1;i<=val;i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
