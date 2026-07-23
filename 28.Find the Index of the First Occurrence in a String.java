class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){//Check every possible starting position where the entire needle can fit-->we only check positions where the entire needle can still fit inside the haystack

            int j=0;// Start comparing the needle from its first character for the current starting position
            
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)){
            // Keep comparing chars until all match or a mismatch is found
                j++;//Move to the next char in both the haystack and the needle
            }
            if(j==needle.length()){//If all chars of the needle matched-->return its starting index
                return i;
            }
        }
        return -1;//If the needle is not found in the haystack
    }
}
/* Practical Approach:
    Check every possible starting position where the needle can fit
    Compare each character of the needle with the corresponding character in the haystack
    If all characters match, return the starting index
    If no match is found, return -1 */

    /*'i' fixes the starting position-->while 'j' checks the remaining characters one by one-->So 'i + j' always points to the current character in the haystack being compared with the current character of the needle(At index j) */
