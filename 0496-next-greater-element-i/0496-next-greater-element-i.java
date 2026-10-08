class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){//We need the first greater element on the RIGHT-->So we go from RIGHT to LEFT, bcoz when we process a number, all elements on its right are already processed and available in the stack
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){//Remove smaller or equal elements-->They cannot be the next greater element bcoz they are not greater than the curr number
                stack.pop();
            }
            if(stack.isEmpty()){//If nothing remains-->there is no greater element on the right
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stack.peek());//The remaining top is the first greater element on the right
            }
            stack.push(nums2[i]);//Push the curr number after finding its answer-->It may become the next greater element for a number that we process later on its left
        }
        int[] result=new int[nums1.length];
        for(int i=0;i<result.length;i++){//Stack is no longer needed-->All answers for nums2 are already stored in the HashMap
            result[i]=map.get(nums1[i]);//Look up nums1[i]'s next greater element from the HashMap
        }
        return result;
    }
}
/* Practical Approach:
    1. Scan nums2 from right to left
    2. Use a stack to find the next greater element for every number
    3. Remove smaller or equal elements from the stack because they cannot be the answer
    4. The remaining stack top is the next greater element
    5. Store each number and its answer in a HashMap
    6. Push the current number into the stack after finding its answer
    7. For nums1, simply look up each number in the HashMap
    8. Store those values in the result array
    9. Return the result */