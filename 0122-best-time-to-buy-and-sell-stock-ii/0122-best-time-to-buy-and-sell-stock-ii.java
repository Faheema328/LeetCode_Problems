class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){//Start from day 1 bcoz we compare today's price with the prev day's price
            if(prices[i]>prices[i-1]){//If today's price is higher than yesterday's-->we have a profitable increase
                profit=profit+(prices[i]-prices[i-1]);//Add this day's increase to the total profit-->We accumulate profit bcoz multiple transactions are allowed
            }
        }
        return profit;//Return the total profit collected from all profitable increases
    }
}
/* Practical Approach:
    1. Start profit at 0
    2. Traverse prices from the second day
    3. Compare today's price with yesterday's price
    4. If today's price is higher, add the difference to profit
    5. Ignore days where the price decreases or stays the same
    6. Continue until the last day
    7. Return the total profit */