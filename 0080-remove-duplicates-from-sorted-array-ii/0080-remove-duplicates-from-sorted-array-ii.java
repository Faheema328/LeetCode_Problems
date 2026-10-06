class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(k<2 || nums[i] != nums[k-2]){//Keep the first two elements automatically-->After that, keep nums[i] only if it is different from the element two positions before
                nums[k]=nums[i];//Place the valid element at position 'k'
                k++;//Move k to the next position
            }
        }
        return k;//'k' represents the number of valid elements
    }
}
/* Practical Approach:
    Use two pointers i and k
    i scans every element in the sorted array
    k represents the position where the next valid element should be placed
    Keep the first two elements automatically
    After that compare nums[i] with nums[k - 2]
    If they are different keep nums[i]
    Place the valid element at nums[k]
    Increment k
    Return k as the length of the valid portion */