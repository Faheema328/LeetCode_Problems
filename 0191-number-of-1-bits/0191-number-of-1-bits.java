class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n != 0){
            count=count+(n&1);//Bitwise AND checks the last binary bit of 'n'-->n & 1 gives '1' if the last bit is 1, otherwise '0'
            n=n>>1;//Bitwise right shift operates on the binary representation of 'n'-->It shifts all bits one position to the right-->This removes the current last bit and lets us check the next bit
        }
        return count;//Return the total number of 1 bits
    }
}
/* Practical Approach:
    Use bitwise operators to work with the binary representation of n
    Check the last bit using n & 1
    If the last bit is 1, increase the count
    Right shift n using n >> 1 to move to the next bit
    Repeat until all bits are processed */