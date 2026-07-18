class Solution {
    public int[] runningSum(int[] nums) {
        int reqArr[]=new int[nums.length];
        reqArr[0]=nums[0];
        for(int i=1;i<reqArr.length;i++){
            reqArr[i]=reqArr[i-1]+nums[i];//Current element(reqArr)=Previous running sum + current element(nums)
        }
        return reqArr;
    }
}

/* Practical Approach:
        Create a new array of the same size as the input array.
        The first element remains the same because there are no previous elements
        For every other element,add the previous running sum(of the reqArr) with the current element(of nums)
        Return the running sum array */
