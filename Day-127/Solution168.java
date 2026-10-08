class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();

        while(n>0){
            n--;
            int val=n%26;
            char ch=(char)(65 + (val));
            sb.append(ch);
            n/=26;
        }

        return sb.reverse().toString();
    }
}
