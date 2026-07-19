class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder();
        Deque<Character> stack=new ArrayDeque<>();

        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch=='B') && !stack.isEmpty()){
                char top=stack.peek();
                if(top=='A'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else if((ch=='D') && !stack.isEmpty()){
                char top=stack.peek();
                if(top=='C'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }

        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.length();
    }
}
