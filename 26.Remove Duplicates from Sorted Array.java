class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int j=0;//j stores the index of the last unique element found
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[j]){//Checks whether the current element is different from the last unique element
                j++;//Move j to the next position for storing the unique element
                nums[j]=nums[i];//Place the unique element in the next position
            }
        }
        return j+1;//(Total no. of unique elements = last unique index + 1)
    }
}
/* Practical Approach:
    The array is already sorted,so duplicate elements are next to each other
    Keep the first occurrence of each unique element
    Move every new unique element to the next available position
    Return the total number of unique elements */
