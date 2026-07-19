class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1=new ArrayDeque<>();
        Deque<Character> stack2=new ArrayDeque<>();

        int n1=s.length();
        int n2=t.length();

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            if(stack1.size()==0 && ch=='#' ){
                continue;
            }
            if(stack1.size()>0 && ch=='#'){
                stack1.pop();
            }
            else{
                stack1.push(ch);
            }
        }

        for(int i=0;i<n2;i++){
            char ch=t.charAt(i);
            if(stack2.size()==0 && ch=='#' ){
                continue;
            }
            if(stack2.size()>0 && ch=='#'){
                stack2.pop();
            }
            else{
                stack2.push(ch);
            }
        }

        while(!stack1.isEmpty()){
            sb1.append(stack1.pop());
        }

        while(!stack2.isEmpty()){
            sb2.append(stack2.pop());
        }




        boolean isEqual = sb1.compareTo(sb2) == 0;

        return isEqual;
    }
}
