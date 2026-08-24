class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();//Stack is a generic class-->so it works only with objects(wrapper classes) but not with primitive data types-->Character is used because the Stack stores opening brackets as chars
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){//If the curr char is an opening bracket-->push it into the Stack and let it wait for its correct closing bracket
                st.push(ch);
            }
            else{//Otherwise-->the curr char must be a closing bracket 
            // Case 1:
                if(st.isEmpty()){//If the Stack is empty-->no opening bracket is waiting to match the curr closing bracket-->So,the parentheses are invalid
                    return false;
                }
            // Case 2:
                if((st.peek()=='(' && ch==')') || (st.peek()=='{' && ch=='}') || (st.peek()=='[' && ch== ']')){//An opening bracket is waiting in the Stack-->Now check whether it is the correct match for the curr closing bracket
                    st.pop();//Correct pair found-->Remove the opening bracket because its job is finished
                }
                else{//The opening bracket exists,but it is not the correct match-->Therefore,the parentheses are invalid
                    return false;
                }
            }
        }
        boolean result=st.isEmpty();//After processing every char-->if the Stack becomes empty,every opening bracket found its correct closing bracket
        return result;
    }
}
/* Practical Approach:
    Use a Stack to keep track of opening brackets
    Push every opening bracket into the Stack
    Whenever a closing bracket appears check whether it matches the top opening bracket
    If it matches remove the top element otherwise return false
    After processing all characters the Stack must be empty for the string to be valid*/
    
//We pop because the opening bracket has found its correct closing bracket-->so it is no longer needed and removing it exposes the next unmatched opening bracket for comparison

/* We push every opening bracket into the Stack because it cannot be verified immediately
It must wait until its corresponding closing bracket appears later in the string
Since the most recently opened bracket must be closed first-->a Stack is the ideal choice bcoz it follows the LIFO principle */