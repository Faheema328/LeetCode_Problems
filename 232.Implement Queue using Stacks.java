/* Practical Approach:
    Use two Stacks to implement Queue behavior
    Keep the oldest element at the top of s1
    During push, move all elements from s1 to s2
    Push the new element into s1, then move everything back from s2 to s1
    Now the oldest element remains at the top, giving FIFO behavior */
class MyQueue {
    Stack<Integer> s1=new Stack<Integer>();//s1 and s2 are Stack objs used to implement Queue behavior
    //Stack is a built-in Java class-->so we can directly create Stack objs
    Stack<Integer> s2=new Stack<Integer>();
    public MyQueue() {
        
    }

    public void push(int x) {
        while(! s1.isEmpty()){
            s2.push(s1.pop());//Move all the existing elements from s1 to s2-->this temporarily removes the elements from s1
        }
        s1.push(x);//Add the new element to the empty s1

        while(! s2.isEmpty()){//Move all the old elements back from s2 to s1-->this places the oldest element at the top of s1
            s1.push(s2.pop());
        }
    }

    public int pop() {//The oldest element is always at the top of s1-->Stack's pop() removes the top element-->So, it behaves like Queue's FIFO dequeue
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();//Returns the oldest element without removing it
    }
    
    public boolean empty() {
        return s1.isEmpty();//Queue is empty when s1 contains no elements

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
