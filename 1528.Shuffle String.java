class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArr=new char[s.length()];//A new array to store the shuffled chars of a string

        for(int i=0;i<s.length();i++){//Traverse the entire string
        //Place every char(of the string)at its correct position in the new array
            charArr[indices[i]]=s.charAt(i);//indices[i] tells the correct index(new position) where the curr char should go in the new array
        }
        String str=new String(charArr);//Convert the charArr back into a String
        return str;
    }
}
/* Practical Approach:
    Create a character array of the same length as the string
    Traverse every character of the original string
    Place each character at the position specified by indices[i]
    Convert the character array into a String and return it */
