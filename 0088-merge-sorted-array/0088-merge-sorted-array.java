class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){//Run 'n' times because nums2 has 'n' elements to copy
        nums1[m+i]=nums2[i];//Copy all elements of nums2 into the empty positions of nums1
        //Start from index m because the first m positions of nums1 are already occupied
       }
       Arrays.sort(nums1);//Sort nums1 after merging both arrays
    }
}
/* Practical Approach:
    The question asks us to merge the sorted elements of nums2 into nums1
    Copy all elements of nums2 into the empty positions of nums1
    Sort nums1 to arrange all elements in ascending order */

