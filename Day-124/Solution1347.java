class Solution {
    public int minSteps(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int[] freq=new int[26];
        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);

            freq[ch-'a']++;
        }
        int count=0;
        for(int i=0;i<n2;i++){
            char ch=t.charAt(i);

            if(freq[ch-'a']>=1){
                freq[ch-'a']--;
            }
            else{
                count++;
            }
        }


        return count;

    }
}
