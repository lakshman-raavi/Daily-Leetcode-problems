class Solution {
    public int minimizedStringLength(String s) {
        Map<Character,Integer>  map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        return map.size();

    }
}
