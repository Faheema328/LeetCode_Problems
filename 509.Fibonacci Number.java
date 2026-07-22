class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int first=0;
        int second=1;
        for(int i=2;i<=n;i++){//Start from 2 because the first 2 Fibonacci numbers (0 and 1)are already known
            int current=first+second;
            first=second;
            second=current;
        }
        return second;//'current' can’t be returned because its scope is only within the loop-->so return 'second'-->which always stores the latest (nth) Fibonacci number
    }
}
/* Practical Approach:
    Handle the base cases when n is 0 or 1
    Start with the first two Fibonacci numbers (0 and 1)
    Use a loop to calculate each next Fibonacci number
    Return the last Fibonacci number obtained */
