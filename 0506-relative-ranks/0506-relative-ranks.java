class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b) -> Integer.compare(score[b],score[a]));//Store indices, not scores-->the comparator checks their corresponding scores
        for(int i=0;i<score.length;i++){//Java automatically compares indices as needed to maintain heap priority
            maxHeap.add(i);
        }
        String[] answer=new String[score.length];//Keep the answer in the original order of the athletes
        int rank=1;//The first index polled has the highest score-->so its rank is 1
        while( !maxHeap.isEmpty()){
            int index=maxHeap.poll();//poll() removes and returns the highest-priority index-->Java compares and rearranges remaining indices internally when needed
            if(rank==1){//index = original position & rank = position based on score
                answer[index]="Gold Medal";
            }
            else if(rank==2){
                answer[index]="Silver Medal";
                }
            else if(rank==3){
                answer[index]="Bronze Medal";
                }
            else{
                answer[index]=String.valueOf(rank);//Convert rank to String bcoz answer is a String array
                }
                rank++;//Move to the next athlete in score order
        }
        return answer;
    }
}
/* Practical Approach:
    1. Create a PriorityQueue that stores athlete indices
    2. Use a reversed comparator to prioritize the highest score
    3. Insert every original index into the PriorityQueue
    4. Poll indices in descending score order and assign ranks
    5. Store each result at its original index in the answer array */