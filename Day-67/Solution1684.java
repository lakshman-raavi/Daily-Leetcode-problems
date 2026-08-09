class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n=words.length;
        int count=0;

        
        for(String word : words){
            boolean is=true;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(allowed.indexOf(ch)==-1){
                    is=false;
                    break;
                }
            }
            if(is==true){
                count++;
            }
        }
        return count;
    }
}
