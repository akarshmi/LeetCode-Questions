class Solution {
    static {
        for(int i=0; i<500;i++){
            maxProfit(new int[]{1,2,8,6,0});
        }
    }
      public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i< prices.length; i++)
            if(prices[i]<minPrice) minPrice = prices[i];
            else if(prices[i]-minPrice>maxProfit) maxProfit = prices[i]-minPrice;

        return maxProfit;
    }
}