class Solution {
    public int[] runningSum(int[] nums) {
        int reqArr[]=new int[nums.length];
        reqArr[0]=nums[0];
        for(int i=1;i<reqArr.length;i++){
            reqArr[i]=reqArr[i-1]+nums[i];
        }
        return reqArr;
    }
}
