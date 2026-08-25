class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x !=0){
            int digit=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && digit>7){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && digit<-8){
                return 0;
            }
            /* Overflow is checked before updating rev
            Bcoz,
                Checking after updating is useless-->the overflow has already occurred */   
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
}
/* MAX_VALUE/10=64 & MIN_VALUE/10=-64 (Safer values)

rev>MAX_VALUE/10(From 65) || rev<MIN_VALUE/10(From -69)-->Exceeds the int limit
rev==MAX_VALUE(64)-->(0-7)[<=7]-->Can be valid
rev==MIN_VALUE(64)-->(0 to -8)[>=-8]-->Can be valid */

/* Practical Approach:
    Extract the last digit of the number one by one
    Build the reversed number by adding each extracted digit
    Remove the last digit after processing it
    Check for overflow before adding the next digit
    Return the reversed number */
