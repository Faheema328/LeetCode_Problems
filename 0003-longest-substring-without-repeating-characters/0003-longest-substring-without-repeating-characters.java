class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        HashSet<Character> set=new HashSet<>();//Stores only the unique chars in the curr window
        for(int right=0;right<s.length();right++){//right expands the window one char at a time
            while(set.contains(s.charAt(right))){//If the curr char already exists-->shrink the window from the left until the duplicate is removed
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));//The curr char is now safe to add 
            int currLength=right-left+1;//Both endpoints are included-->so add 1 to the length
            maxLength=Math.max(currLength,maxLength);//Keep the max length found so far
        }
        return maxLength;
    }
}
/* Practical Approach:
    1. Initialize left = 0, maxLength = 0 and an empty HashSet
    2. Traverse the string using right
    3. While the current character already exists, remove s.charAt(left) and increment left
    4. Add the current character to the set
    5. Calculate current length as right - left + 1
    6. Update maxLength using Math.max()
    7. Return maxLength */