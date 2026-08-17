class CustomStack {
    int stack[];
    int inc[];
    int maxsize;
    int index;
    public CustomStack(int maxSize) {
        this.maxsize=maxSize;
        stack=new int[maxsize];
        inc=new int[maxsize];
        index=-1;

    }
    
    public void push(int x) {
        if(index==maxsize-1){
            return ;
        }
        else{
            index++;
            stack[index]=x;
        }
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }
        int val=stack[index]+inc[index];
        if(index>0){
            inc[index-1]+=inc[index];
        }
        inc[index]=0;
        index--;
        return val;
        
    }
    
    public void increment(int k, int val) {
        int idx=Math.min(k-1,index);
        if(idx>=0){
            inc[idx]+=val;
        }

    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */