class MyQueue {
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.add(s1.peek());
            s1.pop();
        }
        s2.add(x);
        while(!s2.isEmpty()){
            s1.add(s2.peek());
            s2.pop();
        }
        
    }
    
    public int pop() {
        if(!s1.isEmpty()){
            return s1.pop();
        }
         throw new IllegalStateException("Stack is empty");
    }
    
    public int peek() {
         if(!s1.isEmpty()){
            return s1.peek();
        }
        throw new IllegalStateException("Stack is empty");
        
    }
    
    public boolean empty() {
        return s1.isEmpty();
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