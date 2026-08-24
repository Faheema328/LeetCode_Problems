/* Practical Approach:
    Store each number in a HashSet
    Before adding check if the number already exists
    If it exists return true
    Otherwise add it to the HashSet
    If no duplicate is found return false */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();//HashSet stores only unique elements
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){//If the number already exists in the set-->it means we found a duplicate
                return true;
            }
            else{
                set.add(nums[i]);//1st occurrence of this number-->so store it
            }
        } 
        return false;//No duplicate was found
    }
}
/* Practical Approach:(Brute-Force)
    Compare every element with the remaining elements
    If any two elements are equal,a duplicate is found
    Return true immediately if a duplicate exists
    Otherwise, return false */

/* Brute-Force Approach:
    for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){//Start from the next element to avoid comparing an element with itself
                if(nums[i]==nums[j]){//A duplicate is found
                    return true;
                }
            }
        }
        return false;//No duplicate is found */