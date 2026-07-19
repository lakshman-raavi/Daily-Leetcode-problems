class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        if(n==0){
            return "";
        }

        Deque<Character> stack=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(stack.size()>0 && ch==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }


        String res = new StringBuilder(sb).reverse().toString();


       return res;
    }
}
