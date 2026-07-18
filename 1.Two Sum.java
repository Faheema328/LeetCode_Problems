class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                    /* Java doesn't accept returning array literals
                    So,we must create a new array */
                }
            }
        }
        return new int[]{};//When no pair is found
    }
}

/* j=i+1 bcoz:
>Same element shoud not be used twice
>Avoids checking same pair twice */


/* Practical Approach
    Find two different elements whose sum is equal to the target
    Return the indices of those two elements, not the values
    Compare each element with all the remaining elements
    As soon as the target sum is found, return their indices */
