//Happy Number-->A number that eventually becomes 1 when we repeatedly replace the number with the sum of the squares of its digits
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();//If the same number appears again, the process has entered a cycle
        while(n != 1){
            if(set.contains(n)){//If 'n' is already present-->we are repeating the same sequence-->so 'n' will never reach '1'
                return false;
            }
            else{
                set.add(n);//Add the curr number into the set(If it hasn't encountered before)before calculating its next value
            }
            int sum=0;
            while(n != 0){//Extract each digit and calculate the sum of their squares
                int digit=n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;//The calculated sum becomes the new number
        }
        return true;//If the loop ends-->'n' has reached 1
    }
}
/* Practical Approach:
    Use a HashSet to keep track of numbers already seen
    Repeat until n becomes 1 or a cycle is detected:
    1. If n is already present in the set → return false
    2. Add n to the set
    3. Find the sum of squares of its digits
    4. Update n with the calculated sum
    5. If n becomes 1 → return true */