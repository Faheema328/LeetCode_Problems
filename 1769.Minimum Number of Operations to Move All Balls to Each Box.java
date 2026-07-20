class Solution {
    public int[] minOperations(String boxes) {
        int answer[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){//Consider each box as the destination
            int operations=0;//Counts total operations for the current destination box
            for(int j=0;j<boxes.length();j++){//Checks every box to find the balls
                if(boxes.charAt(j)=='1'){
                    operations=operations+Math.abs(i-j);//Add the distance(total no. of steps)required to move the ball to the destination box
                }
            }
            answer[i]=operations;//Stores the total operations for the current destination box in the new array
        }
        return answer;
    }
}
/* Practical Approach:
    The question asks us to find the minimum operations needed to move all balls to each box
    Consider each box as the destination one by one
    Check every box to find the balls
    If a box contains a ball,add the distance needed to move it to the destination
    Store the total operations for each destination box
    Return the final answer array */
