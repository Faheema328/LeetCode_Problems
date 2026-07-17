class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int totalWealth=0;
            for(int j=0;j<accounts[i].length;j++){
               totalWealth=totalWealth+accounts[i][j];
            }
            if(totalWealth>maxWealth){
                maxWealth=totalWealth;
            }
        }
        return maxWealth;
    }
}
