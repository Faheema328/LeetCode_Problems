/* The GCD of two numbers does not change when the larger number is replaced by its remainder after division */
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=n*n;//Sum of the first 'n' odd numbers = n²
        int evenSum=n*(n+1);//Sum of the first 'n' even numbers 

        int gcd=findGCD(oddSum,evenSum);
        return gcd;
    }
    public int findGCD(int a,int b){
        while(b !=0){//Keep reducing the numbers until the remainder becomes 0
        int rem=a%b;
        a=b;//Move b to a
        b=rem;//Move (a%b) to b
        }
        return a;//'a' stores the GCD when 'b' becomes 0
    }
}
/* Practical Approach:
    Calculate the sum of the first n odd numbers using n × n
    Calculate the sum of the first n even numbers using n × (n + 1)
    Find the GCD of both sums using the Euclidean Algorithm
    Return the GCD */

    //Euclidean Algorithm-->GCD(a,b)=GCD(b,a%b)

    /* In mathematics-->"first n even numbers" almost always means the first positive even numbers-->unless the problem explicitly says to include 0 */

    /* When a<b:
    a % b = a
    So the numbers automatically swap in the first iteration 
    GCD(16,20)=GCD(20,16)*/
