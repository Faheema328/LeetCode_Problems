class Solution {
    public String longestPalindrome(String s) {
        String longestString="";
        for(int i=0;i<s.length();i++){
            String odd=expand(s,i,i);//Odd-length palindrome-->both pointers start at the same char-->Example: "bab" — center is 'a'
            String even=expand(s,i,i+1);//Even-length palindrome-->pointers start at adjacent chars-->Example: "bb" — center is between the two 'b' chars
            if(odd.length()>longestString.length()){//Update only if the new palindrome is strictly longer-->If lengths are equal, keep the existing longest palindrome
                longestString=odd;
            }
            if(even.length()>longestString.length()){
                longestString=even;
            }
        }
        return longestString;
    }
    public String expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){//Check boundaries before accessing chars-->left >= 0 prevents a negative index-->right < s.length() prevents an index beyond the string-->charAt(left) == charAt(right) checks whether both ends match
            left--;//Move outward to check the next pair of chars
            right++;
        }
        return s.substring(left+1,right);//The pointers move one step beyond the palindrome-->left + 1 gives the actual starting index and the right is the ending boundary, which substring excludes-->If start == end, the range contains no characters-->Example: substring(1, 1) returns ""
    }
}
/* Practical Approach:
    1. Initialize longest as an empty string
    2. Traverse every character using index i
    3. Expand from (i, i) to find odd-length palindromes
    4. Expand from (i, i + 1) to find even-length palindromes
    5. Continue while pointers are within bounds and characters match
    6. Move left-- and right++ to expand outward
    7. Extract the palindrome using substring(left + 1, right)
    8. Update longest if the new palindrome is longer
    9. Return longest after checking every center */
