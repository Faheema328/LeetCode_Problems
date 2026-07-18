class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){//No carry is needed-->add 1 and return
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;//Current digit is 9-->it becomes 0 and carry moves to the left
        }
        //All digits are 9-->so create a new array with one extra element
        int newArr[]=new int[digits.length+1];
        //New array elements are 0 by default-->only the first element needs to be set to 1
        newArr[0]=1;
        return newArr;
    }
}
/* Practical Approach:
    The given array represents a number
    Add 1 to this number and return the updated array
    Start from the last digit because addition begins from the end
    If a digit becomes 10, make it 0 and carry 1 to the previous digit
    If all digits are 9, create a new array with one extra element */
