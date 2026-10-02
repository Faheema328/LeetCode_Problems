class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        char[] jToCharArr=jewels.toCharArray();//Convert jewels(string) into a char array to process each jewel individually
        char[] sToCharArr=stones.toCharArray();
        for(int i=0;i<jToCharArr.length;i++){//Store every jewel char in the HashSet
            set.add(jToCharArr[i]);
        }
        int count=0;
        for(int j=0;j<sToCharArr.length;j++){//Check every stone to see whether it is a jewel
            if(set.contains(sToCharArr[j])){//If the curr stone exists in the HashSet-->it is a jewel
                count++;
            }
        }
        return count;//Return the total no. of stones that are jewels
    }
}
/* Practical Approach:
    Use a HashSet to store all jewel characters
    1. Add every character from jewels into the HashSet
    2. Traverse stones one character at a time
    3. If the current stone exists in the HashSet → increase the count
    4. Return the final count */