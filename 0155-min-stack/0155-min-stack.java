class MinStack {
    Stack<Integer> st= new Stack<Integer>();
    Stack<Integer> minm=new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            minm.push(val);
        }
        
        else{
            if(val>=minm.peek()){st.push(val);
                minm.push(minm.peek());
            }
            else{st.push(val);
                minm.push(val);
            }
        }
        
    }
    
    public void pop() {
        if(!st.isEmpty())
        {st.pop();
        minm.pop();}
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minm.peek();
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