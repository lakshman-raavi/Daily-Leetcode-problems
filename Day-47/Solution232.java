class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public MyQueue() {
        stack1=new ArrayDeque<>();
        stack2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        int s=stack1.size();
        for(int i=1;i<=s;i++){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack1.push(x);
        int s2=stack2.size();
        for(int i=1;i<=s2;i++){
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }
    
    public int pop() {
        if(!stack1.isEmpty()){
            return stack1.pop();
        }
        return -1;
    }
    
    public int peek() {
        if(!stack1.isEmpty()){
            return stack1.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        if(stack1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
