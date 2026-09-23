class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            int val=(int)s.charAt(i);
            val=val-96;
            sb.append(val);
        }
        long res=0;
        while(k!=0){
            res=0;
            for(int i=0;i<sb.length();i++){
                res+=(sb.charAt(i)-'0');
            }
            k--;
            sb.setLength(0);
            sb.append(res);
        }

        return (int)res;
    }
}
