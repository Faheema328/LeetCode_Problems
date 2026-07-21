class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars=s.toCharArray();//Convert string 's' into a char array
        char[] tChars=t.toCharArray();

        long sumS=0;//Stores the sum of ASCII values of characters in string 's'
        long sumT=0;

        for(char c : sChars){//Enhanced for loop-->Used to traverse each character of string 's'
            sumS=sumS+c;//Add the ASCII value of the current char
        }

        for(char c: tChars){
            sumT=sumT+c;
        }
        char letter=(char) (sumT-sumS);
        return letter;
        //The difference gives the ASCII value of the extra character in string 't'
        //Convert that ASCII value back to a char and store it
    }
}
/* Practical Approach:
    Convert both strings into character arrays
    Add the ASCII values of all characters in string t
    Add the ASCII values of all characters in string s
    Subtract the two sums
    The remaining ASCII value belongs to the extra character
    Convert it back to a character and return it */
