class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){//n/5 counts how many multiples of '5' are present from 1 to n
            n=n/5;//n/5, n/25-->Are not themselves trailing zeroes-->they count the factors of 5 in n! and since (2 × 5 = 10) creates one trailing zero and factorials have more factors of 2 than 5-->the total no. of factors of 5 equals the number of trailing zeroes
            //Divide by 5 repeatedly bcoz some numbers contain more than one factor of '5'
            count=count+n;//Add the number of factors of '5' found at this level
        }
        return count;
    }
}
/* Practical Approach:
    Count how many factors of 5 are present in n!
    Divide n by 5 repeatedly
    Each division counts factors of 5 from multiples of 5, 25, 125, etc.
    Add these values to count */