class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;//Stores the length of the last word
        int i=s.length()-1;
        while(i>=0 && s.charAt(i) ==' '){//Continue only while 'i' points to a valid index in the string-->skip all trailing spaces
            i--;
        }
        while(i>=0 && s.charAt(i) !=' '){
            length++;//Count the chars of the last word
            i--;
        }
        return length;
    }
}
/* Practical Approach:
    Start traversing the string from the end
    Skip all trailing spaces
    Count the characters of the last word
    Stop when a space is encountered
    Return the length of the last word */
