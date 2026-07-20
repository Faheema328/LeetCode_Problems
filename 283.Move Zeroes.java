class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;//Tracks the next position to store a non-zero element
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j]=nums[i];//Move all non-zero elements to the front
                j++;
            }
        }
        while(j<nums.length){//Since the array is modified-->the original zeroes may no longer exist-->so fill the remaining positions with 0
            nums[j]=0;
            j++;
        }
    }
}
/* Practical Approach:
    The question asks us to move all zeroes to the end of the array
    Traverse the array and move all non-zero elements to the front
    Since the array is updated, the original zeroes may no longer exist
    Fill the remaining positions with zeroes */
