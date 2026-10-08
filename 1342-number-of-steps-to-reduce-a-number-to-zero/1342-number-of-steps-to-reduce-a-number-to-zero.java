class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num != 0){
            if(num%2==0){
                num=num/2;//Even number-->divide it by 2
            }
            else{
                num=num-1;//Odd number-->subtract 1 to make it even
            }
            steps++;//Every division or subtraction counts as one step
        }
        return steps;
    }
}
/* Practical Approach:
    1. Start with steps = 0
    2. Repeat until num becomes 0
    3. If num is even, divide it by 2
    4. If num is odd, subtract 1
    5. Increase steps after every operation
    6. Return steps */