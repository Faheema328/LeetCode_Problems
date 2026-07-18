class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){//Negative numbers are not palindromes(-121 != 121-)
            return false;//121- is an invalid integer representation
        }
        int original=x;
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
}
}
