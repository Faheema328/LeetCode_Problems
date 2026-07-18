class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){//Target should be inserted at this index
                return i
            }
        }
        return nums.length;//Target is greater than all elements-->so insert at the end
    }
}
/*Practical Approach:
   The question asks for the index of the target in the sorted array
   If the target is found, return its index
   If the current element becomes greater than the target, return its index because the target should be inserted before it
   If no such element is found, return nums.length because the target should be inserted at the end */
