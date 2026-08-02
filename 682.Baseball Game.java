class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<Integer>();//Stack is a generic class-->so it works only with objs(wrapper classes)but not with primitive data types-->Integer is used because the Stack stores valid scores

        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            if(str.matches("-?\\d+")){//If the str is a valid integer-->convert it into int and store it
                s.push(Integer.parseInt(str));
            }
            else if(str.equals("C")){//"C" means remove the prev valid score
                s.pop();
            }
            else if(str.equals("D")){//"D" means double the prev valid score and push it into the stack as a new valid score
                s.push(s.peek()*2);
            }
            else if(str.equals("+")){//"+" means create a new score using the prev two valid scores
                int first=s.pop();//Temporarily removes the latest score to access the second latest score
                int second=s.peek();//Store the second latest score
                s.push(first);//Restore the removed score bcoz it is still a valid score
                s.push(first+second);//Push the newly created score
            }
        }
        int sum=0;
        while(!s.isEmpty()){//After all operations are completed-->add every valid score to calculate the final answer
            sum=sum+s.pop();
        }
        return sum;
    }
}
/* Practical Approach:
    Use a Stack to store all valid scores
    If the current operation is an integer push it into the Stack
    If it is C remove the previous valid score
    If it is D double the previous valid score and push it
    If it is + add the previous two valid scores and push the new score
    After processing all operations calculate the total score by adding all values in the Stack */

/* 
"-?\\d+":
"-?" --> Minus sign may or may not be present
"\\d+" --> One or more digits must be present
*/
