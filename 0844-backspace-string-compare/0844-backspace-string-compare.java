class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS=new Stack<>();//Create two stacks
        Stack<Character> stackT=new Stack<>();

        char s_Arr[]=s.toCharArray();//Convert the str into a char array to process each char individually
        char t_Arr[]=t.toCharArray();

        for(int i=0;i<s_Arr.length;i++){//Process string 's'
            if(s_Arr[i]=='#'){//'#' acts like a backspace-->If the stack is not empty,then remove the prev char-->If the stack is empty,there is nothing to delete-->so '#' is ignored
                if(!stackS.isEmpty()){//The inner if checks whether the stack has something to pop-->The else below belongs to the OUTER if, not this inner if */
                stackS.pop();
                }
            }
            else{//This else executes only when s_Arr[i] is NOT '#'-->So a '#' is never pushed into the stack-->Only the normal chars are pushed into the stack
                stackS.add(s_Arr[i]);
            }
        }
        for(int j=0;j<t_Arr.length;j++){//Process string 't' in the same way
            if(t_Arr[j]=='#'){//'#' removes the prev char if one exists
                if(!stackT.isEmpty()){//If stackT is empty-->pop() is simply skipped and '#' is ignored
                stackT.pop();
                }
            }
            else{
                stackT.push(t_Arr[j]);//Push normal char into the stack
            }
        }
        boolean equalStrings=stackS.equals(stackT);//Compare the final contents of both stacks-->'.equals()' compares their contents whereas '==' checks if both variables refer to the same obj
        return equalStrings;
    }
}
/* Practical Approach:
    Use a stack to simulate the backspace operation
    For every character:
    1. If the character is normal → push it into the stack
    2. If the character is # → pop the previous character if the stack is not empty
    3. If # appears when the stack is empty → simply ignore it
    4. Do the same for both strings
    5. Compare the final stacks using .equals()
    6. If both stacks are equal → return true */