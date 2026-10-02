class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        int m=s.length();
        if(n!=m){
            return false;
        }

        for(int i=0;i<m;i++){
            char ch=s.charAt(i);

            if(words.get(i).charAt(0)!=ch){
                return false;
            }
        }
        return true;
    }
}
