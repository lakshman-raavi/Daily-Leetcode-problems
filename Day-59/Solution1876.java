class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();

        int total=0;
        int l=0;
        int r=0;
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);
            }
            if((r-l+1)==3){
                total++;
                l++;
            }
            map.put(ch,r);
            r++;
        }
        return total;
    }
}
