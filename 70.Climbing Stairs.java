class Solution {
    public int climbStairs(int n) {
       if(n==1){
        return 1;
       }
       if(n==2 || n==3){
        return n;
       }
       int first=2;
       int second=3;

       for(int i=4;i<=n;i++){//Calculate the number of ways from stair 4 to n
        //Current ways = previous two ways
        int current=first+second;
        first=second;//Update 1st and 2nd
        second=current;
       }
       return second;//second holds the final answer after the loop ends(bcoz current goes out of scope after loop ends)
    }
}
/* Practical Approach:
    The question asks for the total number of distinct ways to reach the nth stair
    You can climb either 1 stair or 2 stairs at a time
    The number of ways to reach the current stair is the sum of the previous two stairs
    Keep updating the last two answers until you reach the nth stair */
