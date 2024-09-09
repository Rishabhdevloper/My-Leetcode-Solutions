class Solution {

     public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                 if(text1.charAt(i-1)==text2.charAt(j-1)){
               dp[i][j]=1+dp[i-1][j-1];
         } 
         else  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        return dp[n][m];
    }


    public int minDistance(String word1, String word2) {
        int len=longestCommonSubsequence(word1,word2);
        int del=word1.length()-len;
        int ins=word2.length()-len;
        return del+ins;
    }
}