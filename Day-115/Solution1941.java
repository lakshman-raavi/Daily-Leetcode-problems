class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        int val=freq[s.charAt(0)-'a'];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']>val || freq[ch-'a']<val){
                return false;
            }

        }

        return true;
    }
}
