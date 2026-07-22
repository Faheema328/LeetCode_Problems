class Solution {
    public int removeElement(int[] nums, int val) {
        int write=0;//Points to the next position where a valid element(!=val) should be placed
        for(int read=0;read<nums.length;read++){
            if(nums[read] != val){//If the current element is valid
                nums[write]=nums[read];//Place the valid element at the curr valid position
                write++;
            }
        }
        return write;//Since write always points to the next valid position-->it represents the total count of valid elements
    }
}
/* Practical Approach:
    Use one pointer to read every element in the array
    Use another pointer to keep track of the next position for a valid element
    If the current element is not equal to val, copy it to the write pointer position
    Move the write pointer after placing a valid element
    Return the number of valid elements */
