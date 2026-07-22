class Solution {
    public boolean isPalindrome(String s) {
        int left=0;  
        int right=s.length()-1;

        /* The invalid chars are not removed from the string-->the pointers simply skip over them so that only the valid letters and digits are compared */
        while(left<right){//Keep comparing one pair after another until the pointers meet or cross
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                /* As long as the left pointer has not crossed the right pointer and the current left char is not a letter or digit-->keep moving the left pointer forward */
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                /* left < right is a safety check because the pointers are moving inside the inner loops-->Without it,the code can access invalid indices */
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){//Get the char at the left index of the string and convert that char to lowercase
                return false;
            //Compare both chars after converting them to lowercase
            }
            left++;
            right--;//Since the current chars matched-->move both pointers toward the center
        }
        return true;//No mismatch found-->so it's a palindrome
    }
}
/* Practical Approach:
    Use two pointers, one starting from the beginning and one from the end of the string
    Move the left pointer forward and the right pointer backward until we find
    valid alphanumeric characters (letters or digits)
    Compare both characters after converting them to lowercase
    If they are different, the string is not a palindrome
    Continue this process until both pointers meet or cross each other
    If no mismatch is found, return true */
