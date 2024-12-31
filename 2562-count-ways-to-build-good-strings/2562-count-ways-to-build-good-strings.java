class Solution {
    int mod=1000000007;
    public int f(int low, int high, int zero, int one,int len,int dp[]){
           if(len>high)return 0;
           int cntzero=len+zero;
           int cntone=len+one;
           if(dp[len]!=-1)return dp[len];
           if(cntzero>=low&&cntzero<=high){
            cntzero=1;
           }
           else{
            cntzero=0;
           }
           if(cntone>=low&&cntone<=high){
            cntone=1;
           }
           else{
            cntone=0;
           }

           int ans=cntzero+f(low,  high,  zero,  one,len+zero,dp)+cntone+f(low,  high,  zero,  one,len+one,dp);
           return dp[len]=ans%mod;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int len=0;
       
        int dp[]=new int[high+1];
        Arrays.fill(dp,-1);
      return  f(low,high,zero,one,len,dp); 
    }
}