class Solution {
    public int climbStairs(int n) {
       if(n==1){
        return 1;
       }
       if(n==2 || n==3){
        return n;
       }
       int first=2;
       int second=3;
       for(int i=4;i<=n;i++){
        int current=first+second;
        first=second;
        second=current;
       }
       return second;
    }
}
