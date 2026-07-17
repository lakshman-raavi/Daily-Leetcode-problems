class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        if(s.equals(goal)){
            return true;
        }
        StringBuilder sb=new StringBuilder(s);

        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=sb.charAt(0);
            for(int j=1;j<n;j++){
                sb.setCharAt(j-1,sb.charAt(j));
            }
            sb.setCharAt(n-1,ch);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }

}
