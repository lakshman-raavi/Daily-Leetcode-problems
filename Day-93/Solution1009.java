class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
        int len=sb.length();
        for(int i=0;i<len;i++){
            char ch=sb.charAt(i);
            if(ch=='1'){
                sb.setCharAt(i,'0');
            }
            else{
                sb.setCharAt(i,'1');
            }
        }

        return Integer.parseInt(sb.toString(),2);
    }
}
