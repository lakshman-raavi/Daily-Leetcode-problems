class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int maxlen=0;
        for(int i=0;i<26;i++){
            int val=freq[i];
            if(val==0){
                continue;
            }
            else if(val%2==0){
                maxlen+=2;
            }
            else{
                maxlen++;
            }
        }

        return maxlen;
    }
}
