class Solution {
    public int maxProfit(int[] prices) {
        Integer min = Integer.MAX_VALUE;
        Integer maxProfit = 0;
        for(Integer i = 0; i < prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            }

            if (prices[i] - min > maxProfit)
            {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}
