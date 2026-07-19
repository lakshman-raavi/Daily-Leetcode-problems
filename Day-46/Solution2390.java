class Solution {
    public String removeStars(String s) {
        Deque<Character>  stack=new ArrayDeque<>();

        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(stack.size()>0 && ch=='*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        String res=new StringBuilder(sb).reverse().toString();
        return res;
    }
}
