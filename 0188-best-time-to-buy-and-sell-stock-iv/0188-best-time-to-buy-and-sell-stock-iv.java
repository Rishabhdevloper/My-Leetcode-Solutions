class Solution {
     public int f(int indx,int buy,int prices[],int profit,int dp[][][],int k){
            if(indx==prices.length||k==0)return 0;
            if(dp[indx][buy][k]!=-1)return dp[indx][buy][k];
            if(buy==1){
                 profit=Math.max(-prices[indx]+f(indx+1,0,prices,profit,dp,k),f(indx+1,1,prices,profit,dp,k));
            }
            else{
               profit=Math.max(prices[indx]+f(indx+1,1,prices,profit,dp,k-1),f(indx+1,0,prices,profit,dp,k));
            }
            return dp[indx][buy][k]=profit;
        }









    public int maxProfit(int k, int[] prices) {
         int n=prices.length;
        int buy=1;
        int profit=0;
        
        int dp[][][]=new int[n][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
         return f(0,buy,prices,profit,dp,k);
    }
}