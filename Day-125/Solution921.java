class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int left=0;
        int right=0;

        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
               if(!st.isEmpty() && st.peek()=='('){
                st.pop();
               }
               else
               st.push(ch);
            }
        }

        while(!st.isEmpty()){
            char ch=st.pop();
            if(ch=='('){
                left++;
            }
            else{
                right++;
            }
        }

        return Math.abs(left+right);
    }
}
