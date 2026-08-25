class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanValues=new HashMap<>();//Store the integer value of each Roman numeral in a HashMap
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);

        int total=0;
        for(int i=0;i<s.length();i++){//Traverse the Roman numeral from left to right
            int curr=romanValues.get(s.charAt(i));//Convert the curr Roman symbol into its integer value
            if(i+1<s.length() && curr<romanValues.get(s.charAt(i+1))){//If the next char(of the roman numeral)exits && the curr value is smaller than the next value
                total=total-curr;//Smaller value before a larger value-→ Subtract
            }
            else{
                total=total+curr;//Add curr value to the total
            }
        }
        return total;
    }
}
/* Practical Approach:
    Store the value of each Roman numeral in a HashMap
    Traverse the string from left to right
    If the current value is smaller than the next value, subtract it
    Otherwise, add the current value
    Return the total */