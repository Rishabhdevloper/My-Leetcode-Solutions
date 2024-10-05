class Solution {
    public static int f(int indx,int amount,int coins[],int dp[][]){
      if(indx==0){
        if(amount%coins[indx]==0)return 1;
        else{
            return 0;
        }
      }

       if(dp[indx][amount]!=-1)return dp[indx][amount];
      int nottake=f(indx-1,amount,coins,dp);
      int take=0;
      if(coins[indx]<=amount){
        take=f(indx,amount-coins[indx],coins,dp);
      }
      return dp[indx][amount]= nottake+take;
    }






    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
       int ans=f(n-1,amount,coins,dp);
       return ans; 
    }
}