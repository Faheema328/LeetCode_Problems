class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long expectedSum=(long) ((n*(n+1))/2);//Sum of all numbers from 0 to n
        long actualSum=0;
        for(int num : nums){//Find the sum of all numbers present in the array
            actualSum=actualSum+num;
        }
        int missingNum=(int) (expectedSum-actualSum);//Expected sum - Actual sum = Missing number
        return missingNum;
    }
}
/* Practical Approach:
    Find the expected sum of all numbers from 0 to n using the sum formula
    Find the actual sum of all numbers present in the array
    Expected sum - Actual sum gives the missing number
    Use long for the sum to avoid integer overflow */
