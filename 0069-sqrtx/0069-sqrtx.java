class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        while(low<=high){
            int mid=low+(high-low)/2;//Find the middle of the search range-->This formula avoids possible overflow from (low + high) / 2
            long square=(long) mid*mid;//Use long to prevent overflow when squaring mid
            if(square==x){//Found an exact square root
                return mid;
            }
            else if(square<x){//mid is valid, but a larger square root might exist
                low=mid+1;
            }
            else{//mid is too large, so search smaller numbers
                high=mid-1;
            }
        }
        return high;//When the loop ends, low > high-->high is the largest integer(smaller than low) whose square is <= x-->low is the next number, whose square is greater than x-->Example: x = 8, low = 3 and high = 2, so return 2
    }
}
/* Practical Approach:
    1. Apply binary search from 0 to x
    2. Calculate mid to check the middle number
    3. Square mid and compare it with x
    4. If mid * mid equals x, return mid
    5. If mid * mid is smaller, search the right half
    6. If mid * mid is larger, search the left half
    7. When the search ends, return high as the integer square root */