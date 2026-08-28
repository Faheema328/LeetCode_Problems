class Solution {
    public double myPow(double x, int n) {
        long pow=n;//Use long because 'n' can be Integer.MIN_VALUE = -2147483648-->If we directly do:  n = -n-->it becomes 2147483648, which is greater than Integer.MAX_VALUE and cannot be stored in an int causing integer overflow-->long can safely store this value
        if(pow<0){//For a negative power-->x⁻ⁿ = (1 / x)ⁿ
            x=1/x;
            pow=-pow;
        }
        double ans=1;//Stores the extra 'x' values when the power is 'odd'
        while(pow>0){
        if(pow%2==1){//If power is odd-->one 'x' remains unpaired-->so multiply it into 'ans'
            ans=ans*x;
        }
            x=x*x;//Combine pairs of 'x' by squaring it
            pow=pow/2;//After combining pairs-->only half the power remains
        }
        return ans;//Return the final value of 'x' raised to the original power
    }
}
/* Practical Approach:
    Convert a negative power by using 1 / x and making the power positive
    If the power is odd, store the extra x in ans
    Square x to combine pairs of x values
    Divide the power by 2 after processing the pairs
    Repeat until the power becomes 0 */