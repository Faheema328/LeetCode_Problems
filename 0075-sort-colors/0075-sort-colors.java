class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){//Controls the no. of passes we need at most (length - 1 passes) bcoz after each pass-->one element reaches its correct position at the end-->Once length - 1 elements are fixed,the last element is automatically in the correct position
            for(int j=0;j<nums.length-1-i;j++){//Performs the adjacent comparisons and swaps during each pass
            /* -1 → j compares nums[j] with nums[j + 1]
               -i → after every pass, one element at the end is already sorted, so we don't check it again */
                if(nums[j]>nums[j+1]){//If the adjacent elements are in the wrong order-->swap them
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                }
            }
        }
    }
}
/* Practical Approach:
    Use Bubble Sort to arrange the colors in ascending order
    Compare adjacent elements and swap them if they are in the wrong order
    After each pass, the largest remaining element reaches its correct position at the end
    Repeat the passes until the whole array becomes sorted */
