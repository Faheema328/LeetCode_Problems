class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;//Curr consecutive 1s
        int maxCount=0;//Max consecutive 1s found so far
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                if(count>maxCount){
                    maxCount=count;//Keep the longest streak(count) found so far
                }
            }
            else{
                count=0;//0 breaks the consecutive sequence-->so start counting 1s again
            }
        }
        return maxCount;
    }
}
/* Practical Approach:
    1. Traverse the array from left to right
    2. Keep count for the current consecutive 1s
    3. If the current element is 1, increase count
    4. If the current element is 0, reset count to 0 because the streak is broken
    5. Update max with the largest count found so far
    6. Return max */