class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift=0;//Counts how many rightmost bits are removed
        while(left != right){//We keep shifting both numbers right until they become equal-->Why only left and right?-->If the endpoints differ at a particular bit, then somewhere in the range that bit changes, meaning that bit cannot survive the AND
            left=left>>1;//Remove the rightmost binary bit
            right=right>>1;
            shift++;//Remember how many bits were removed
        }
        return left<<shift;//left and right are equal here, so either one can be used to restore the bit positions that were removed

    }
}
/* Practical Approach:
    Keep removing the rightmost bit from both left and right
    until they become equal
    1. Compare left and right
    2. If they are different, remove the last bit from both
    3. Repeat until left == right
    4. The remaining value is the common binary prefix
    5. Return it */