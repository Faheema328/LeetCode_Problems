class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;//If 'k' is greater than or equal to 'n'-->only the remainder matters-->Rotating 7 times(If the array length is 5) is the same as rotating 2 times
        reverse(nums,0,n-1);//Reverse the entire array
        reverse(nums,0,k-1);//The first 'k' elements are the elements that originally came from the end of the array but they are currently reversed-->So reverse the first 'k' elements to restore their order
        reverse(nums,k,n-1);//Reverse the remaining elements to restore their original order
    }
    public void reverse(int[] nums,int left,int right){
        while(left<right){//Swap the elements at the two ends
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;//Move both pointers towards the center
            right--;
        }
    }
}
/* Practical Approach:
    Rotate the array to the right by k positions using the reversal method
    Calculate k % n because rotating n times brings the array back to its original form
    Reverse the entire array
    Reverse the first k elements to restore the last k elements into their correct order
    Reverse the remaining elements to restore the remaining elements into their correct order */