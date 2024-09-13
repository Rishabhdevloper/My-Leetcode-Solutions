class Solution {
    public int f(int indx,int buy,int prices[],int profit,int dp[][][],int cap){
            if(indx==prices.length||cap==0)return 0;
            if(dp[indx][buy][cap]!=-1)return dp[indx][buy][cap];
            if(buy==1){
                 profit=Math.max(-prices[indx]+f(indx+1,0,prices,profit,dp,cap),f(indx+1,1,prices,profit,dp,cap));
            }
            else{
               profit=Math.max(prices[indx]+f(indx+1,1,prices,profit,dp,cap-1),f(indx+1,0,prices,profit,dp,cap));
            }
            return dp[indx][buy][cap]=profit;
        }




    public int maxProfit(int[] prices) {
         int n=prices.length;
        int buy=1;
        int profit=0;
        int cap=2;
        int dp[][][]=new int[n][2][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
         return f(0,buy,prices,profit,dp,cap);

    }
}