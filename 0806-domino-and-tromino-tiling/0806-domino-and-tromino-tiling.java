class Solution {
    public static int solve(int n,int dp[],int mod){
        if(n==1||n==2)return n;
        if(n==3)return 5;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=((2*solve(n-1,dp,mod)%mod)+(solve(n-3,dp,mod)%mod))%mod;
    }


    public int numTilings(int n) {
        int mod=(int)1e9+7;
        int dp[]=new int[10001];
        Arrays.fill(dp,-1);
       return solve(n,dp,mod);
        
    }
}