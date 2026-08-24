class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] newArr=new int[nums.length];//newArr to store the final answers
       int[] sorted=nums.clone();//Create a copy bcoz sorting the original array changes its order and the answer must be returned in the original order
       Arrays.sort(sorted);//Sort only the copied array
       for(int i=0;i<nums.length;i++){//Traverse every element of the original array
        int count=0;
        for(int j=0;j<sorted.length;j++){//Search the curr element of the original array in the sorted array
            if(sorted[j]==nums[i]){//Always use the first occurrence bcoz duplicate elements are not smaller than themselves
                count=j;//First occurrence index in sorted array = Count of smaller elements
                break;//Stop at the first occurrence bcoz duplicates are not smaller than the curr element
            }
        }
        newArr[i]=count;//Store the answer(No. of numbers smaller than the curr no.)for the curr element
       }
       return newArr;
    }
}
/* Practical Approach:
    Create a copy of the original array because the original order must be preserved
    Sort only the copied array
    For every element in the original array find its first occurrence in the sorted array
    The index of the first occurrence equals the number of elements smaller than the current element
    Store this count in the result array */