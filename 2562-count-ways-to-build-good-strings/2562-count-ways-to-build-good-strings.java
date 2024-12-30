class Solution {
    int mod=1000000007;
   
    public int f(int low, int high, int zero, int one,int len,int dp[]){
           if(len>high)return 0;
           if(dp[len]!=-1)return dp[len];
           int ans=f(low,  high,  zero,  one,len+zero,dp)+f(low,  high,  zero,  one,len+one,dp);
           if(len>=low&&len<=high)ans++;
           return dp[len]=ans%mod;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int len=0;
        int dp[]=new int[high+1];
        Arrays.fill(dp,-1);
      return  f(low,high,zero,one,len,dp); 
    }
}