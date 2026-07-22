class Solution {
    public int smallestNumber(int n) {
        while((n & (n+1)) != 0){//Continue checking until the current number contains all set bits
            n++;
        }
        return n;//Return the smallest number(>=n)with all set bits(1)
    }
}
/* Practical Approach:
    Start checking from the given number
    If the current number contains all set bits, return it
    Otherwise move to the next number
    Repeat until an all set bits number is found */

    
/*Golden Rule:
    7  = 0111
    7 + 1 = 1000
    0111 & 1000 = 0000
    Therefore,
    (n & (n + 1)) == 0*/

