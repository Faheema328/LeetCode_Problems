class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n != 0){
            sum=sum+(n%10);//Adds the last digit to the sum
            product=product*(n%10);
            n=n/10;
        }
        int difference=product-sum;
        return difference;
    }
}
/* Practical Approach:
    The question asks us to find the difference between the product and the sum of the digits
    Extract each digit one by one from the number
    Add the digit to the sum and multiply it with the product
    Return the difference between the product and the sum */
