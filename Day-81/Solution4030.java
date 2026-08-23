class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch : s.toCharArray()){
            StringBuilder str=new StringBuilder(Integer.toBinaryString(ch));
            while(str.length()<8){
                str.insert(0,'0');
            }

            sb.append(str);
        }

        String reverse=new StringBuilder(sb).reverse().toString();

        return reverse.equals(sb.toString());
        
    }
}
