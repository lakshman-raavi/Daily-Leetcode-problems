class MinStack {
    class Pair{
        int val;
        int minval;

        Pair(int val,int min){
            this.val=val;
            this.minval=min;
        }
    }
    Deque<Pair> stack;
    public MinStack() {
        stack=new ArrayDeque<>();
    }
    
    public void push(int value) {
        int currentMin = stack.isEmpty() ? value : Math.min(value, stack.peek().minval);
        stack.push(new Pair(value,currentMin));
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            Pair p=stack.peek();
            return p.val;
        }
        return -1;
    }
    
    public int getMin() {
        if(!stack.isEmpty()){
            return stack.peek().minval;
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
