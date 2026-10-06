class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){//For every number, find its corresponding index and mark that index as -ve to show that the number(nums[i]) has appeared-->Math.abs() is needed bcoz we ourselves make some array values negative while marking, but we still need their original +ve number to find the correct index
            int index=Math.abs(nums[i])-1;//'-1' is used bcoz array indexes start from 0 while the numbers in the array start from 1
            if(nums[index]<0){//The curr value has appeared before-->so it is a duplicate
                list.add(Math.abs(nums[i]));//Add the already seen value to the list(Not the index)
            }
            else{
                nums[index]=-Math.abs(nums[index]);//Mark this index's value as -ve to indicate that the corresponding number(nums[i]) has appeared
            //-nums[index] would flip the sign but -Math.abs(nums[index]) always makes it negative
        }
        }
        return list;
    }
    }
/* Practical Approach:
    Use the array itself as a visited marker
    Treat every value as an index using 'value - 1'
    Use Math.abs() because values may already be negative
    If nums[index] is positive the value is being seen for the first time
    If nums[index] is negative the value has already been seen so add it to the answer
    Make nums[index] negative to mark that the value has been visited
    Return the answer list */