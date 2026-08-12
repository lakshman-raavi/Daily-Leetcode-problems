class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int left=0;
        int maxFreq=0;
        Map<Character,Integer> map=new HashMap<>(); 
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            while ((r - left + 1) - maxFreq > k) {
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                // if(map.get(s.charAt(left))==0){
                //     map.remove(s.charAt(left));
                // }
                left++;
            }

            max=Math.max(max,r-left+1);
            
        }
        return max;
    }
}
