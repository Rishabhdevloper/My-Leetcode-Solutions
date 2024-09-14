class Solution {
          public int f(int indx,int buy,int prices[],int profit,int dp[][],int fee){
            if(indx>=prices.length)return 0;
            if(dp[indx][buy]!=-1)return dp[indx][buy];
            if(buy==1){
                 profit=Math.max(-prices[indx]+f(indx+1,0,prices,profit,dp, fee),f(indx+1,1,prices,profit,dp,fee));
            }
            else{
               profit=Math.max(prices[indx]+f(indx+1,1,prices,profit,dp,fee)-fee,f(indx+1,0,prices,profit,dp,fee));
            }
            return dp[indx][buy]=profit;
        }










    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int buy=1;
        int profit=0;
        int dp[][]=new int[n][2];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }

        return f(0,buy,prices,profit,dp,fee);
    }
}