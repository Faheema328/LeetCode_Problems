class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){//Visit each customer(Each row represents one customer)
            int totalWealth=0;
            //Visit each bank account(Each column represents one bank)
            for(int j=0;j<accounts[i].length;j++){//accounts[i].length-->No. of banks ith customer has
            totalWealth=totalWealth+accounts[i][j];//accounts[i][j]-->ith customers' money in jth bank
            }
            if(totalWealth>maxWealth){
                maxWealth=totalWealth;
            }
        }
        return maxWealth;
    }
}

/* Practical Approach:
    Calculate the total wealth of each customer by adding all their bank balances
    Compare each customer's wealth with the maximum wealth found so far
    Return the maximum wealth */
