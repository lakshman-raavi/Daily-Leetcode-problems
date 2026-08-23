class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder();
        sb.append('a');
        while(sb.length()<k){
            StringBuilder copy=new StringBuilder();
            for(int i=0;i<sb.length();i++){
                int val=sb.charAt(i)-'a';
                char result = (char) ('a' + ((val+1) % 26));
                copy.append(result);
            }
            sb.append(copy);
        }

         return sb.charAt(k - 1);
        
    }
}
