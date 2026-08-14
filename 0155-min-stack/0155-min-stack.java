class MinStack {
    Stack <Integer> st1;
    Stack <Integer> minstack;
    public MinStack() {
        st1=new Stack<>();
        minstack=new Stack<>();
        
    }
    
    public void push(int value) {
        st1.push(value);
        if(minstack.isEmpty()){
            minstack.push(value);
        }
        else{
            minstack.push(Math.min(value,minstack.peek()));
        }
        
    }
    
    public void pop() {
        if(!st1.isEmpty()){
            st1.pop();
            minstack.pop();
        }
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
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