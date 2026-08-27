/* Practical Approach:(Sieve of Eratosthenes)
    Initially assume every number from 2 to n - 1 is prime
    For every prime number, mark its multiples as false
    Start j from i * i because smaller multiples are already marked by smaller prime factors
    Use i * i < n to avoid unnecessary processing of i values when no new composite multiples need to be marked within n
    Finally count all numbers that are still marked true */
class Solution {
    public int countPrimes(int n) {
        boolean isPrime[]=new boolean[n];//isPrime[i] tells whether 'i' is currently considered prime-->Initially every position is false because boolean arrays are automatically initialized with false
        for(int i=2;i<n;i++){//Initially assume every number from 2 to n - 1 is prime-->0 and 1 are not prime
            isPrime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){//If it is still true-->it is a prime number
            //i*i < n-->We only process 'i' while it can produce a new composite multiple within the required rang-->Once i*i reaches or exceeds n, further 'i' values are unnecessary to process
            //Non-prime's(composites') multiples are already marked false by their prime factors-->so processing them again is unnecessary 
                for(int j=i*i;j<n;j=j+i){//Start j from i*i-->Smaller multiples of 'i' are already marked by smaller prime factors
                //j < n-→ only consider numbers less than 'n'
                //j += i-→ jump to the next multiple of 'i' 
                    isPrime[j]=false;//Mark all the multiples of 'i'(composite) as false
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){//Check every number from 2 to n - 1
            if(isPrime[i]){//If the numbers are still marked true-->it is a prime number
                count++;
            }
        }
        return count;//Return the total no. of prime numbers less than 'n'
    }
}
/* Practical Approach:(Brute-Force)
    Check every number from 2 to n-1
    For each number check if it has any divisor other than 1 and itself
    If a divisor is found it is not prime
    Otherwise increase the count */

/* Brute-Force Approach:
    int  count=0;
        for(int i=2;i<n;i++){//0 and 1 are not prime-->so start checking from 2(prime numbers start from 2)
            boolean isPrime=true;
            for(int j=2;j<i;j++){//Check possible divisors from 2 to i-1-->We start from 2 bcoz every prime number is divisible by 1-->We stop before i bcoz every number is divisible by itself and We only need to check divisors between 2 and i-1
                if(i%j==0){//if 'i' is divisible by j(any number b/n 1 and i-1)-->'i' is not prime
                    isPrime=false;
                    break;//No need to check more divisors
                }
            }
            if(isPrime){//If no divisor was found-->'i' is prime
                count++;
            }
        }
        return count; */
