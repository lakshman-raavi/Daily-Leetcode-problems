class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            char ch=brokenLetters.charAt(i);
            set.add(ch);
        }
        int count=0;
        String[] words=text.split(" ");

        for(String word : words){
            boolean is=true;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(set.contains(ch)){
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
