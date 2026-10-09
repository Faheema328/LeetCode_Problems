class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;//Farthest index we can reach so far
        for(int i=0;i<nums.length;i++){
            if(i>maxReach){//If the curr index is beyond our farthest reach-->we are stuck
                return false;
            }
            maxReach=Math.max(maxReach,i+nums[i]);//'i = curr index'-->nums[i] = maximum jump distance from this position-->i + nums[i] = farthest index reachable from here-->We can choose a shorter jump, we don't have to jump the full distance
            if(maxReach>nums.length-1){//nums.length - 1 is the last index-->If maxReach equals or exceeds it, the destination is reachable
                return true;
            }
        }
        return true;//The loop normally finishes only if no return was triggered-->For a non-empty array, this is logically redundant: an unreachable index returns false, and reaching the last index returns true-->Java still requires a return value for every possible execution path
    }
}
/* Practical Approach:
    1. Initialize maxReach = 0 to track the farthest reachable index
    2. Traverse the array from index 0
    3. If i > maxReach, the current index is unreachable, so return false
    4. Calculate the farthest reachable index using i + nums[i]
    5. Update maxReach with the greater of the old and new reach
    6. If maxReach reaches the last index, return true
    7. If the loop finishes, return true */