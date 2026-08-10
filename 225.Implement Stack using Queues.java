/* Practical Approach:
    Use one Queue internally to implement Stack behavior
    After adding a new element, rotate the older elements behind it
    This keeps the newest element at the front of the Queue
    Then Queue's remove() and peek() can behave like Stack's pop() and top() */
class MyStack {
    Queue<Integer> q=new LinkedList<Integer>();//Queue is the DS we use internally-->LL is a built-in Java class(concrete class) that implements the Queue interface
    //Java internally manages its nodes-->so, we don't create Node objects ourselves
    public MyStack() {
    //Constructor-->creates a MyStack obj
    //It is empty bcoz no special initialization is needed
    }
    
    public void push(int x) {
        q.add(x);//Normally, Queue adds the new element at the back
        for(int i=0;i<q.size()-1;i++){//Rotate the older elements behind the newly added elemen-->'i' is only a counter used to repeat the rotation size - 1 times
            q.add(q.remove());//Remove the front element and immediately add it to the back-->This moves each older element behind the newly added element
        }
    }
    
    public int pop() {//The newest element is always at the front-->Queue's remove() removes the front element-->so, it behaves like Stack's LIFO pop()
        return q.remove();
    }
    
    public int top() {//peek() returns the front element without removing it-->Since the newest element is at the front,it behaves like Stack's top()
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();//Returns true when the Queue contains no elements
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/* Example:
    Before push(3): [2, 1]
    After q.add(3): [2, 1, 3]
    After rotation: [3, 2, 1]
    Thus, the newest element is always kept at the front */
