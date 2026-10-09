class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        //Create a Max Heap so the largest stone is removed first
        for(int stone : stones){//Insert all stone weights into the maxHeap
            maxHeap.add(stone);
        }
        while(maxHeap.size()>1){//We need at least two stones to perform a smash
            int y=maxHeap.poll();//poll() removes and returns the largest stone
            int x=maxHeap.poll();//The next poll() returns the second-largest stone

            if(x != y){//poll() removes both stones-->if their weights are equal, both are destroyed and nothing is added back
                maxHeap.add(y-x);//The smaller stone 'x' is destroyed-->The larger stone 'y' changes to weight (y - x)-->Adding the difference represents that updated stone
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();//If no stones remain-->return 0-->Otherwise, return the weight of the last remaining stone
    }
}
/* Practical Approach:
1. Create a Max Heap
2. Insert all stones
3. Remove the two largest stones
4. Add their difference if they are unequal
5. Return the remaining weight, or 0 */
