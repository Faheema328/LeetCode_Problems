class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){//Enhanced 'for loop'-->Takes one num of an array at a time
            int digits=0;
            while(num != 0){//Counts the digits of the current array element
                digits++;
                num=num/10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}

/* Method-2(By using built-in function)
  int count=0;
  for(int i=0;i<nums.length;i++){
    String str=Integer.toString(nums[i]);//Converts array element(Integer) into string
    if(str.length()%2==0){
        count++;
    }
  }
  return count; */


}
