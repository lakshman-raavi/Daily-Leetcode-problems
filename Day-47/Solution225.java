class MyStack {
    Deque<Integer> queue;

    public MyStack() {
        queue=new ArrayDeque<>();
    }
    
    public void push(int x) {
        int s=queue.size();
        queue.push(x);

        for(int i=1;i<=s;i++){
            queue.push(queue.peek());
            queue.pop();
        }

    }
    
    public int pop() {
        if(!queue.isEmpty()){
            return queue.pop();
        }
        return -1;
    }
    
    public int top() {
        if(!queue.isEmpty()){
            return queue.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        if(queue.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
