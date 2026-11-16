class Solution {
    public List<String> stringSequence(String target) {
        List<String> res=new ArrayList<>();

        int k=0;
        int n=target.length();

        for(int i=0;i<n;i++){
            char ch='a';
            for(int j=0;j<26;j++){
                StringBuilder sb=new StringBuilder(target.substring(0,k));
                if(ch==target.charAt(k)){
                    res.add(sb.toString()+String.valueOf(ch));
                    k++;
                    break;
                }
                else{
                    res.add(sb.toString()+String.valueOf(ch));
                }
                ch++;
                
            }
        }

        return res;
    }
}
