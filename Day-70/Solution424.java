class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxfreq=0;
        int len=0;
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));

            while((i-left+1)-maxfreq > k){
                char str=s.charAt(left);
                map.put(str,map.get(str)-1);
                left++;
            }
            len=Math.max(len,(i-left+1));
        }
        return len;
    }
}
