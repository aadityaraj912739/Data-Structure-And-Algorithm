class MyQueue {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        shift();
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1;
    }

    public int peek() {
        shift();
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        return -1;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void shift() {
        if (stack2.isEmpty()) {               
            while (!stack1.isEmpty()) {       
                stack2.push(stack1.pop());
            }
        }
    }
}
