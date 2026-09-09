class Solution {
    public int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE;//Keep track of the 3 distinct max values-->Long.MIN_VALUE is used as a special marker meaning-->"this max has not been found yet"-->It is a smaller than any possible int value(-2147483648 also)
        long secondMax=Long.MIN_VALUE;
        long thirdMax=Long.MIN_VALUE;

        for(int num : nums){
            if(num==firstMax || num==secondMax || num==thirdMax){//Ignore duplicate values bcoz we only need distinct max numbers
                continue;
            }
            else if(num>firstMax){
                thirdMax=secondMax;//We must shift the old values before changing firstMax-->If we change firstMax first, the old firstMax is lost
                secondMax=firstMax;
                firstMax=num;
            }
            else if(num>secondMax){//If num is not greater than firstMax but is greater than secondMax then it becomes the new second max
                thirdMax=secondMax;
                secondMax=num;
            }
            else if(num>thirdMax){//If num is not greater than firstMax or secondMax but is greater than thirdMax then it becomes thirdMax
                thirdMax=num;
            }
            }
            return thirdMax==Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;//If no third max-→ return firstMax else return thirdMax
    }
}
/* Practical Approach:
    Keep track of the first, second and third distinct maximum values
    For every number:
    1. Ignore the number if it is already equal to one of the maximum values
    2. If it is greater than first → shift first to second and second to third
    3. Otherwise, if it is greater than second → shift second to third
    4. Otherwise, if it is greater than third → update third
    5. If third maximum exists → return third
    6. Otherwise → return first */