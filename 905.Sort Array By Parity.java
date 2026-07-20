class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int newArr[]=new int[nums.length];
        int j=0;//Stores the index of the new array where elements are placed one after another
        for(int i=0;i<nums.length;i++){//Copy all even numbers first
            if(nums[i]%2==0){
                newArr[j]=nums[i];
                j++;//Move to the next empty position in the new array
            }
        }
        for(int i=0;i<nums.length;i++){//Copy all odd numbers next
            if(nums[i]%2 != 0){
                newArr[j]=nums[i];
                j++;
            }
        }
        return newArr;
    }
}
//Parity-->Even or Odd

/* Practical Approach:
    The question asks us to place all even numbers before all odd numbers
    Traverse the array and copy all even numbers into a new array
    Traverse the array again and copy all odd numbers after the even numbers
    Return the new array */
