class MinStack {
    Stack<Long>st=new Stack<>();
    long mini=Long.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
      if(st.isEmpty()){
        mini=val;
        st.push((long)val);
      }
      else{
      if(val<mini){
        st.push(2*(long)val-mini);
        mini=val;
      }
      else{
        st.push((long)val);
      } 
    } 
    }
    
    public void pop() {
        if(st.isEmpty())return;
        long s=st.peek();
        st.pop();
        if(s<mini){
            mini=2*mini-s;
        }
        
    }
    
    public int top() {
        if(!st.isEmpty()){
            long b=st.peek();
            if(b<mini)return (int)mini;
            return (int)b;
        }
        throw new IllegalStateException("Stack is empty");
    }
    
    public int getMin() {
        if(!st.isEmpty()){
            return (int)mini;
        }
        throw new IllegalStateException("Stack is empty");
        
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