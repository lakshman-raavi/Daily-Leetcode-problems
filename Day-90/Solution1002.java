class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        List<String> res=new ArrayList<>();
        int matchcount=0;
        for(int i=0;i<words[0].length();i++){
            char ch=words[0].charAt(i);
            boolean is=true;
            for(int j=1;j<n;j++){
                int idx=words[j].indexOf(ch);
                if(idx!=-1){
                    words[j] = words[j].substring(0, idx) + words[j].substring(idx + 1);
                }
                else{
                    is=false;
                    break;
                }
            }
            if(is==true){
                res.add(Character.toString(ch));
            }
        }
        return res;
    }
}
