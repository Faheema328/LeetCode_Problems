class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();//Count the frequency of every number in the array
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            /* getOrDefault(num, 0):
            If num exists-→ returns its current frequency
            If num does not exist-→ returns 0
            +1 is then added in both cases-->put() either creates a new key-value pair or updates the value of an existing key */
        }
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        /* Create an array of Lists-->List<Integer>[] means:
        An array where every position can hold a List<Integer>-->The bucket index represents the frequency-->The List stores all numbers having that frequency-->nums.length + 1 is used bcoz the max possible frequency of any number is nums.length */

        for(int num : map.keySet()){//Place every number into its frequency bucket
            int frequency=map.get(num);
            if(buckets[frequency] == null){//Initially, a bucket position is null-->Create the List before using .add() bcoz we cannot call .add() on null
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(num);//Store the number in the bucket matching its frequency
        }
        int[] result=new int[k];//Create space for exactly k answers
        int index=0;//index represents the next position to fill in result
        for(int frequency=buckets.length-1;frequency>=0;frequency--){//Traverse from highest frequency to lowest-->buckets.length-1 is the highest possible frequency-->We move backwards bcoz we want the most frequent elements first
            if(buckets[frequency] != null){//Skip frequencies for which no bucket was created
                for(int num : buckets[frequency]){//Process all numbers having this frequency
                    result[index]=num;//Put the curr number into the next result position
                    index++;

                    if(index==k){//Once 'k' elements are collected-->we already have the complete answer, so return immediately
                    /* If k = 5 and only 2 elements were collected,
                    index = 2 and 2 == 5 is false
                    So this return would not execute-->The loop would continue searching for more elements */
                        return result;
                    }
                }
            }
        }
        return result;//If fewer than 'k' elements somehow existed, the loop would finish without index == k, and this line would return the partially filled result array
    }
}
/* Practical Approach:
    1. Count the frequency of every number using a HashMap
    2. Create buckets where the index represents frequency
    3. Put each number into the bucket matching its frequency
    4. Traverse buckets from highest frequency to lowest
    5. Add elements to the result until k elements are collected */