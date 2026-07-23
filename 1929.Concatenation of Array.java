class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int newArr[]=new int[2*n];
        for(int i=0;i<n;i++){//Traverse the original array
            newArr[i]=nums[i];//Copy the old array into the first half of the new array
            newArr[i+n]=nums[i];//Copy the old array again into the second half of the new array
        }
        return newArr;
    }
}
/* Practical Approach:
    Create a new array of size 2 × n
    Traverse the original array once
    Store each element in the first half of the new array
    Store the same element again in the second half of the new array
    Return the new concatenated array */
