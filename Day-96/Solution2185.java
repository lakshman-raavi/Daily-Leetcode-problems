class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int tarlen=pref.length();
        int n=words.length;

        for(String word : words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
