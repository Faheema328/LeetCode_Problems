/* Practical Approach:(Optimal solution)
    Count the frequency of every character using an integer array
    Traverse the string again from left to right
    If a character's frequency is 1, it is the first unique character
    Return its index
    If no unique character exists, return -1 */
class Solution {
    public int firstUniqChar(String s) {
        int count[]=new int[26];//Array with 26 positions for the lowercase letters from a to z-->Each position stores how many times that char appears
        for(int i=0;i<s.length();i++){//First pass-→ Count the frequency of every char
            count[s.charAt(i)-'a']++;//s.charAt(i) gets the curr char(of the string)-->Subtracting 'a' from the curr char converts it into an index-->Increase the count at that char's index
        }
        for(int j=0;j<s.length();j++){//Second pass-→ Check chars in their original order-->This helps us find the 1st char that appears only once
            if(count[s.charAt(j)-'a']==1){//Get the count of the curr char
                return j;//The curr char appears exactly once-->Return its index bcoz it is the 1st unique char
            }
        }
        return -1;//No char appears exactly once
    }
}
/* Practical Approach:(Brute-Force)
    Pick one character at a time
    Count how many times it appears in the entire string
    If its count is 1, return its index
    If no unique character is found, return -1 */

/* Brute-Force Approach:
    for(int i=0;i<s.length();i++){//Pick one char at a time
            int count=0;
            for(int j=0;j<s.length();j++){//Traverse the entire string to count occurrences of the current character
                if(s.charAt(i)==s.charAt(j)){
                    count++;//Count how many times the current char appears in the entire string
                }
            }
            if(count==1){//If the char appears only once-->return its index
                return i;
            }
        }
        return -1;//If no char is found */