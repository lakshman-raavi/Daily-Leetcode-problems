class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }

        int vowelmax=0;
        int consonantmax=0;


        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                if(vowelmax<freq[ch-'a']){
                   vowelmax= freq[ch-'a'];
                }
            }
            else{
                if(consonantmax<freq[ch-'a']){
                    consonantmax=freq[ch-'a'];
                }
            }
        }

        return vowelmax+ consonantmax;

    }
}
