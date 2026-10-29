class Solution {
    public boolean isVow(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int vowelStrings(String[] words, int left, int right) {
        
        int n=words.length;
        int[] pref=new int[n];

        if(isVow(words[0].charAt(0))==true && isVow(words[0].charAt(words[0].length()-1))==true){
            pref[0]=1;
        }

        for(int i=1;i<n;i++){
            pref[i]=pref[i-1];
            if((isVow(words[i].charAt(0))==true) && (isVow(words[i].charAt(words[i].length()-1))==true)){
                pref[i]++;
            }
        }
        if(left==0){
            return pref[right];
        }

        return pref[right]-pref[left-1];
    }
}
