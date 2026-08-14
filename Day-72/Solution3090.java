class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int len=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                // if(map.get(s.charAt(left))==0){
                //     map.remove(s.charAt(left));
                // }
                left++;
            }
            len=Math.max(len,(i-left+1));
        }
        return len;
    }
}
