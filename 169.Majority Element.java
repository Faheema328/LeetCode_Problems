class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majElement=(nums.length)/2;//Find the mid index(the majority element is always here)
        return nums[majElement];//Return the element at the middle index(the majority element)
    }
}
/* Practical Approach:
    The question asks us to find the element that appears more than n/2 times
    Sort the array
    The majority element will always be at the middle index after sorting
    Return the middle element */
