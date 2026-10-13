class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){//Binary search continues while the search range is not empty
            int mid=left+(right-left)/2;
            if(nums[mid]==target){//If the middle element is the target-->return its index
                return mid;
            }
            if(nums[left] <= nums[mid]){//Check whether the left half of the curr search range is sorted-->This question guarantees that the array is sorted and then rotated-->so at least one half will be sorted
                if(nums[left]<=target && target<nums[mid]){//Left half is sorted-->Check whether the target lies within this sorted half
                    right=mid-1;//Target is in the left half-->discard mid and the right half
                }
                else{
                    left=mid+1;//Target is not in the sorted left half-->Search the right half instead
                }
            }
            else{//Left half is not sorted, so the right half is sorted-->The 'rotation break' lies in the left half
                if(nums[mid]<=target && target<=nums[right]){//Check whether the target lies within the sorted right half
                    left=mid+1;//Target is in the right half-->discard mid and the left half
                }
                else{
                    right=mid-1;//Target is not in the sorted right half-->Search the left half instead
                }
            }
        }
        return -1;//The search range became empty, so the target does not exist
    }
}
/* Practical Approach:
    1. Initialize left = 0 and right = nums.length - 1
    2. Calculate mid while left <= right
    3. If nums[mid] equals target, return mid
    4. Check whether the left half of the CURRENT search range is sorted
    5. If the left half is sorted, check whether target lies within it
    6. If yes, move right = mid - 1; otherwise, move left = mid + 1
    7. If the left half is not sorted, the right half must be sorted
    8. Check whether target lies within the sorted right half
    9. If yes, move left = mid + 1; otherwise, move right = mid - 1
    10. Return -1 if the target is not found */