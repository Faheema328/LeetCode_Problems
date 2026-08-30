class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){//For every number, find its corresponding index and mark that index as -ve to show that the number has appeared-->Math.abs() is needed bcoz we ourselves make some array values negative while marking, but we still need their original +ve number to find the correct index
            int index=Math.abs(nums[i])-1;//'-1' is used bcoz array indexes start from 0 while the numbers in the array start from 1
            nums[index]=-Math.abs(nums[index]);//Mark this index's value as -ve to indicate that the corresponding number has appeared-->Math.abs() makes the value +ve first and then '-' makes it -ve so the mark always stays -ve
        /* After marking:
            Negative value → corresponding number is present
            Positive value → corresponding number is missing */
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);//Index 'i' corresponds to number i + 1-->1 → 0 & 2 → 1 &3 → 2
            }
        }
        return list;
    }
}
/* Practical Approach:
    Use the array itself to keep track of which numbers have appeared
    For each number, find its corresponding index using number - 1
    Mark that index as negative to indicate that the number is present
    Math.abs() is needed because some values become negative due to our marking
    After marking, positive values indicate the numbers that never appeared
    Convert the positive index i back to its corresponding number using i + 1 */