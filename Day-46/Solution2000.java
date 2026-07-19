class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        Deque<Character> stack=new ArrayDeque<>();
        int n=word.length();
        if (!word.contains(String.valueOf(ch))){
            return word;
        }
        
        int idx=-1;
        for(int i=0;i<n;i++){
            char curr=word.charAt(i);
            if(curr!=ch){
                stack.push(curr);
            }
            else{
                idx=i;
                break;
            }
        }
        sb.insert(0,word.charAt(idx));
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.append(word.substring(idx+1));
        return sb.toString();
    }
}
