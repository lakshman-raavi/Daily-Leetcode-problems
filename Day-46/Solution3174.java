class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        Deque<Character> stack=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return (sb).reverse().toString();
    }
}
