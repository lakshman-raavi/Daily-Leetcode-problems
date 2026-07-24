class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");

        StringBuilder res=new StringBuilder();


        for(int i=0;i<words.length;i++){
            res.append(new StringBuilder(words[i]).reverse().toString());
            if(i!=words.length-1){
                res.append(" ");
            }
        }
        return res.toString();

    }
}
