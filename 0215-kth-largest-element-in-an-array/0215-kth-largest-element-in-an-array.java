class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);//Sort the array in ascending order
        return nums[nums.length-k];//The largest element is at index 'length - 1'-->The kth largest is at index 'length - k'-->Subtract 'k' bcoz array indexing starts from 0
    }
}
/* Practical Approach:
    1. Sort the array in ascending order
    2. The largest element is at index length - 1
    3. The second largest is at index length - 2
    4. Therefore, the kth largest is at index length - k
    5. Return nums[length - k] */