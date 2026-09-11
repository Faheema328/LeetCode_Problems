class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){//Powers of 3 are always positive-->1 = 3^0 is also considered a power of 3
            return false;
        }
        while(n%3==0){//Keep dividing 'n' by 3 as long as it is completely divisible by 3
            n=n/3;//Remove one factor of 3
        }
        boolean ans=(n==1);//If only 1 remains-->all factors of 'n' were 3-->So, 'n' was a power of 3
        return ans;
    }
}
/* Practical Approach:
    A power of 3 has the form 3^k
    1. Keep dividing n by 3
    2. If n is divisible by 3, divide it
    3. Continue until n can no longer be divided by 3
    4. If the final value is 1 → n was a power of 3
    5. Otherwise → it was not a power of 3 */