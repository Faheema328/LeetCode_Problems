//Valid Anagram-->Two strings are valid anagrams if they contain exactly the same characters with the same frequency but possibly in a different order
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){//If lengths of the two strings are different-->they cannot be anagrams
            return false;
        }
        int count[]=new int[26];//Stores the frequency difference for each lowercase letter
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;//Add the occurrence of the chars from 's'
            count[t.charAt(i)-'a']--;//Subtract the occurrence of the chars from 't'
        }
        for(int i=0;i<26;i++){//If both strings have the same frequency of every char-->all values in the frequency array will be 0
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
/* Practical Approach:
    Count the characters of s and t using one frequency array
    Add for characters from s and subtract for characters from t
    If all frequencies become 0 both strings are valid anagrams */