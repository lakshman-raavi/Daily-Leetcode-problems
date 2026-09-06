class Solution {
    public String restoreString(String s, int[] indices) {
        
        int n=indices.length;
        char[] res=new char[n];
        for(int i=0;i<n;i++){
            int idx=indices[i];
            char ch=s.charAt(i);
            res[idx]=ch;
        }
        return new String(res);
    }
}
