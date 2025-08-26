class MinStack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> newStack = new Stack();
    
    public void push(int val) {
        stack.push(val);
        if(newStack.isEmpty() || newStack.peek() >= stack.peek()){
            newStack.push(stack.peek());
        }
    }
    
    public void pop() {
        if(!stack.isEmpty() && !newStack.isEmpty() && stack.peek() == newStack.peek()){
            stack.pop();
            newStack.pop();
        }else{
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(newStack.isEmpty()){
            return -1;
        }else{
            return newStack.peek();
        }
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