class Solution {
    public int maximum69Number (int num) {
        char []digits=String.valueOf(num).toCharArray();
        //Convert the number into a char array so that each digit can be accessed using its index
        for(int i=0;i<digits.length;i++){//Find the first occurrence of '6'
            if(digits[i]=='6'){
                digits[i]='9';
                break;//Only one digit can be changed
            }
        }
        String str=new String(digits);//Converts the character array into a String by creating a String object from it(char array)
        return Integer.parseInt(str);//parseInt()accepts only a String,not a character array
    }
}
/* Practical Approach:
    The question asks us to get the maximum number by changing at most one digit
    Convert the number into a character array
    Change the first '6' to '9'
    Convert it back to an integer and return it */
