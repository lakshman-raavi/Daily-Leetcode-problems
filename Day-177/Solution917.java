class Solution {
    public String reverseOnlyLetters(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                st.push(ch);
            }
        }


        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ((ch>=65 && ch<=90) || (ch>=97 && ch<=122))){
                sb.append(st.pop());
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
