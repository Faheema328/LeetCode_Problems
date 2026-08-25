class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();//Stores: 'number-→ latest index' where it appeared
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){//Check if this number appeared before
                if(i-map.get(nums[i]) <= k){//map.get(nums[i]) gives the prev index of this number-->And, 'i - prev index' gives the distance between the duplicates
                    return true;
                }
            }
            map.put(nums[i],i);//Store/update the latest index of the curr number
        }
        return false;//No nearby duplicate was found
    }
}
/* Practical Approach:
    Store each number with its latest index in a HashMap
    If the number appears again check the index difference
    If the difference is <= k return true
    Otherwise update the number with its latest index */