class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];//Stores the lowest stock price seen so far
        int maxProfit=0;//Store the max profit found so far
        for(int i=1;i<prices.length;i++){//Start from index '1' bcoz prices[0] is already used as the initial minPrice
            minPrice=Math.min(minPrice,prices[i]);//Compare today's price with the min price seen so far-->Keep the smaller one bcoz we always want to buy at the cheapest price possible
            int profit=prices[i]-minPrice;//Calculate the profit if we sell the stock today "Today's price - Cheapest buying price" seen so far
            maxProfit=Math.max(profit,maxProfit);//Compare today's profit with the max profit found so far-->Keep whichever is larger
        }
        return maxProfit;
    }
}
/* Practical Approach:
    Keep track of the minimum stock price seen so far
    For every day:
    1. Update the minimum price if today's price is cheaper
    2. Calculate the profit if we sell today
    3. Update maxProfit if today's profit is higher
    We only move from left to right because we must buy BEFORE selling */