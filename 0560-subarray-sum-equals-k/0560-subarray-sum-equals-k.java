class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();//Stores: Prefix Sum-→ Number of times that prefix sum appeared
        map.put(0,1);//Represents one empty prefix before the array starts-->This helps count any valid subarray that starts from index '0' to any curr index 'j' is equal to 'k'
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];//Update the running prefix sum--->sum now represents the sum of all elements from index 0 to the curr index 'j'
           /*  We want:
               Curr Prefix Sum - Previous Prefix Sum = k
               Therefore:
               Previous Prefix Sum = Curr Prefix Sum - k and So we check whether we have previously seen a prefix sum equal to sum - k */
            if(map.containsKey(sum-k)){//Means how many prev prefixes can be removed from the curr prefix to leave a subarray whose sum is exactly k-->The subarray specifically ends at the curr index 'j' bcoz the curr prefix sum includes elements only from index 0 up to 'j'
                ans=ans+map.get(sum-k);//Its' frequency tells how many such prev prefixes exist bcoz each occurrence creates one different valid subarray
            }
            if(map.containsKey(sum)){//Now store/update the curr prefix sum-->We do this after checking bcoz this curr prefix sum should help find subarrays ending at future indices-->If the same sum appeared before, increase its frequency bcoz the same prefix sum at different positions can create different valid subarrays later
                map.put(sum,map.get(sum)+1);//Curr prefix sum appeared before, so increase its frequency
            }
            else{
                map.put(sum,1);//First time seeing this prefix sum
            }
        }
        return ans;//Return the total no. of subarrays whose sum equals 'k'
    }
}
/* Practical Approach:
    Keep a running prefix sum while traversing the array
    For the current prefix sum, find the previous prefix sum needed so that the subarray between them has sum k
    The required previous prefix sum is sum - k
    If it exists, its frequency tells how many valid subarrays end at the current index
    Store/update the frequency of every prefix sum for future subarrays */