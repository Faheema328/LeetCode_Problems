class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){//Java int has exactly 32 bits-->so we process all 32 bits
            result=(result<<1) | (n&1);//Get the rightmost bit of 'n'-->n & 1 gives either 0 or 1-->Shift result left to make space for the new bit-->then attach the extracted bit using |(bitwise or)
            n=n>>>1;//Move 'n' one bit to the right so its next bit becomes the rightmost bit--> '>>>' is unsigned right shift:it fills the left side with 0 instead of copying the sign bit(1) which is important bcoz Java int is signed
        }
        return result;//After processing all 32 bits, result contains the bits of n in reversed order
    }
}
/* Practical Approach:
    1. Start result at 0
    2. Repeat the process exactly 32 times because int has 32 bits
    3. Get n's last bit using n & 1
    4. Shift result left by 1 to make space for that bit
    5. Add the extracted bit using |
    6. Shift n right by 1 using >>> to process its next bit
    7. Use >>> because it fills the left side with 0 instead of copying the sign bit
    8. Return result */