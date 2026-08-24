class Solution {
    public void reverseString(char[] s) {
        int left=0;//left starts from the 1st char
        int right=s.length-1;//right starts from the last char
        while(left<right){//Continue swapping until both pointers meet
            char temp=s[left];//Store the left char temporarily-->so it is not lost when s[left] is replaced
            s[left]=s[right];//Move the right char to the left position
            s[right]=temp;//Move the temporarily stored left char to the right position
            left++;//Move left pointer one position forward
            right--;//Move right pointer one position backward
        }
    }
}
/* Practical Approach:
    Use two pointers starting from both ends of the array
    Swap the characters at both pointers
    Move the left pointer forward and the right pointer backward
    Continue until both pointers meet */
