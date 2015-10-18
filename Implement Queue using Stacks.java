class MyQueue {
    private Stack<Integer> pushStack = new Stack<Integer>();
    private Stack<Integer> popStack = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        pushStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(popStack.empty()) {
            move();
        }
        popStack.pop();
    }

    // Get the front element.
    public int peek() {
        if (popStack.empty()) {
            move();
        }
        return popStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return pushStack.empty() && popStack.empty();
    }
    
    private void move() {
        while(!pushStack.empty()) {
             popStack.push(pushStack.pop());   
        }
    }
}
