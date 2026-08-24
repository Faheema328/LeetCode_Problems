/* Practical Approach:
    Use two Stack objects inside our own MinStack class
    stack stores all the elements
    minStack stores the minimum values needed at each stage
    During push, if the new value becomes the current minimum, store it in minStack
    During pop, remove from minStack only when the removed element is the current minimum
    getMin() simply returns minStack.peek(), so it works in O(1) */
class MinStack {
    Stack<Integer> s=new Stack<Integer>();//'s' is a reference variable of type Stack<Integer> which  points to a Stack obj that stores Integer objects
    Stack<Integer> ms=new Stack<Integer>();//ms=min stack
    //ms is another Stack<Integer> obj which stores the min value whenever a new minimum is found
    public MinStack() {
    //Constructor of our own MinStack class-->It is empty bcoz the Stack objs are already created above
    }
    
    public void push(int value) {
        s.push(value);//Stores every element in the normal stack
        if(ms.isEmpty() || value<=ms.peek()){//If ms is empty-->val is automatically the min or if val is smaller than or equal to the curr min-->val becomes the new curr min
            ms.push(value);
        }
    }
    
    public void pop() {
        if(s.peek().equals(ms.peek())){//Checks the element about to be removed from stack
        //If it is also the curr min-->remove it from minStack too
        ms.pop();
        }
        s.pop();//Also removes the top element from the normal stack
    }
    
    public int top() {
        return s.peek();//Returns the top element of 's' without removing it
    }
    
    public int getMin() {
        return ms.peek();//'ms' always keeps the curr min at its top-->So, we can get the min directly in O(1) time
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