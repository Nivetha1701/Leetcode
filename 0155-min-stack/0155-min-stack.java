class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min_stack=new Stack<>();

    public MinStack() {
        
    }
    public void push(int val) {
        stack.push(val);
        if(min_stack.size()==0 || val<=min_stack.peek()){
            min_stack.push(val);
        }
    }
    public void pop() {
        int v=stack.pop();
        if(v==min_stack.peek()){
            min_stack.pop();
        }
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */