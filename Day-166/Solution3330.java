class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        int n=word.length();
        char prev=word.charAt(0);
        int res=1;
        for(int i=1;i<n;i++){
            char ch=word.charAt(i);
            if(ch==prev){
                count++;
            }
            else{
                if(count>1){
                    res+=(count-1);
                }
                count=1;
            }
            prev=ch;
        }
        res+=(count-1);

        return res;
    }
}
