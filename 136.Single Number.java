class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;//All duplicate elements become 0,leaving only the single element
    }
}
/* Practical Approach:
    Every element appears twice except one element
    XOR of two same numbers is 0
    XOR of 0 with any number gives that number
    XOR of two different numbers gives a new number based on their binary bits
    XOR all the elements to get the single element */
