class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer=new ArrayList<String>();
        //"answer(1-indexed)"-->Generate one result for every number from 1 to n
        for(int i=1;i<=n;i++){//Start from 1 because the answer should contain exactly n outputs-->Starting from 0 adds one extra element
            if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }
            else if(i%3==0){
                answer.add("Fizz");
            }
            else if(i%5==0){
                answer.add("Buzz");
            }
            else{
                answer.add(Integer.toString(i));//Not divisible by 3 or 5-->Convert the integer into a String before storing
            }
        }
        return answer;
    }
}
/* Practical Approach:
    Traverse every number from 1 to n
    Check divisibility by both 3 and 5 first
    Then check divisibility by 3
    Then check divisibility by 5
    Otherwise convert the number into a String and store it
    Return the final answer List */