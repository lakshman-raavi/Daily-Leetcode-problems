class Solution {
    public int vowelConsonantScore(String s) {
        int vct=0;
        int cct=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("aeoui".indexOf(ch)!=-1 ){
                vct++;
            }
            else if(Character.isAlphabetic(ch)){
                cct++;
            }
        }
        if(cct!=0)
        return (vct/cct);
     return 0;
        
    }
}
