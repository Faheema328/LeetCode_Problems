class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){//Calculate the sum of the entire array
            totalSum=totalSum+nums[i];
        }
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum=totalSum-leftSum-nums[i];//Exclude the curr element from both sides
            if(leftSum==rightSum){//Found the leftmost pivot index
                return i;
            }
            leftSum=leftSum+nums[i];//Add the curr element to the leftSum when moving to the next index
        }
        return -1;//No pivot index was found
    }
}
/* Practical Approach:
    1. Calculate the sum of all array elements
    2. Initialize leftSum to 0 because index 0 has no elements before it
    3. Traverse the array from left to right
    4. Calculate rightSum by excluding leftSum and the current element
    5. If leftSum equals rightSum, return the current index
    6. Otherwise, add the current element to leftSum
    7. If no pivot exists, return -1 */