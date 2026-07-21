class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];//Assume the 1st string is the common prefix initially

        for(int i=1;i<strs.length;i++){ //Compare the curr prefix with every remaining string
            while(!strs[i].startsWith(prefix)){
            // If the current string(at the current index)doesn't start with the prefix-->keep removing the last character from the old prefix until it matches
                prefix=prefix.substring(0,prefix.length()-1);
            //substring(SI(0),EI) returns the string from index 0 up the second last char-->so the last character is removed
            if(prefix.isEmpty()){//No common prefix exists
                return "";
            }
            }
        }
        return prefix;//Return the longest common prefix
    }
}
/* Practical Approach:
    Assume the first string is the common prefix
    Compare it with every remaining string
    If the current string doesn't start with the prefix, keep removing the last character from the prefix until it matches
    Return the remaining prefix */
