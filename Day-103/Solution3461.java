class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>2){
            StringBuilder next=new StringBuilder();
            for(int i=1;i<sb.length();i++){
                int val1=sb.charAt(i-1)-'0';
                int val2=sb.charAt(i)-'0';
                next.append((val1+val2)%10);
            }
            sb=next;
        }
        return sb.charAt(0) == sb.charAt(1);


        
    }
}
