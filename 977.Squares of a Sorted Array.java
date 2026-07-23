class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];//Square every element in the array
        }
        Arrays.sort(nums);//Sort the squared array in ascending order
        return nums;
    }
}
/* Practical Approach:
    Square every element in the array
    Sort the squared array
    Return the sorted squared array */
