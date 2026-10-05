class Solution {
    public int minSteps(String s, String t) {
        int[] freq=new int[26];
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int count=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(freq[ch-'a']>=1){
                freq[ch-'a']--;
                count++;
            }
        }

        return (n-count)+(t.length()-count);
    }
}
