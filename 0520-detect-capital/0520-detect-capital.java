class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCaseCount=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                upperCaseCount++;//Count how many uppercase letters are present
            }
        }
        if(upperCaseCount==0){//Valid case 1:-->all letters are lowercase
            return true;
        }
        if(upperCaseCount==word.length()){//Valid case 2:-->all letters are uppercase
            return true;
        }
        if(upperCaseCount==1 && Character.isUpperCase(word.charAt(0))){//Valid case 3:-->only the first letter is uppercase
            return true;
        }
        return false;//Any other capitalization pattern is invalid
    }
}
/* Practical Approach:
    1. Count the number of uppercase letters in the word
    2. If uppercase count is 0, all letters are lowercase
    3. If uppercase count equals word length, all letters are uppercase
    4. If uppercase count is 1, check whether the first letter is uppercase
    5. If any of these three patterns is valid, return true
    6. Otherwise, return false */