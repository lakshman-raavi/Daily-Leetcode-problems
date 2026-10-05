class Solution {
    public int minLengthAfterRemovals(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='a'){
                if(!st.isEmpty() && (st.peek()=='b' && ch=='a')){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                if(!st.isEmpty() && (st.peek()=='a' && ch=='b')){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }

        return st.size();

    }
}
