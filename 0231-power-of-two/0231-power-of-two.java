class Solution {
    public boolean isPowerOfTwo(int n){
        if(n<=0){//No power of 2 has the value '0'-->so we use n<=0 to reject 0 and all negative values
            return false;
        }
        else{
            return (n & (n-1))==0;//A power of 2 contains only one '1' bit in its binary representation-->So, n & (n - 1) removes that only 1 bit and becomes '0'
        }
    }
}
/* Practical Approach:
    Check if n is positive
    Use n & (n - 1) to remove the rightmost 1 bit
    For a power of 2 only one 1 bit is present, so the result becomes 0 */