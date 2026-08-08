class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String sent : sentences){
            String[] words = sent.split(" ");
            count=Math.max(count,words.length);
        }
        return count;
    }
}
