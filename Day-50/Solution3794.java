class Solution {
    public String reversePrefix(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        if(k==1){
            return s;
        }
        if(k==n){
            return new StringBuilder(s).reverse().toString();
        }
        
        sb.append(s.substring(0, k));
        sb.reverse();
        sb.append(s.substring(k, n));
        return  sb.toString();

        
    }
}
